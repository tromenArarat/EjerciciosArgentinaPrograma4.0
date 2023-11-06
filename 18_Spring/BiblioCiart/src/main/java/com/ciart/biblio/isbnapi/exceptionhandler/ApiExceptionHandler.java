package com.ciart.biblio.isbnapi.exceptionhandler;

import com.ciart.biblio.isbnapi.exceptionhandler.Problem;
import com.ciart.biblio.isbnapi.domain.exception.BusinessException;
import com.ciart.biblio.isbnapi.domain.exception.IsbnNotFoundException;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

	public static final String MSG_GENERIC_FINAL_USER_ERROR
	= "An unexpected system error has occurred. Try again and if "
			+ "the problem persists, contact the administrator.";
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception e){
		Problem problem = Problem.builder()
				.timestamp(LocalDateTime.now())
				.type(e.getClass().getSimpleName())
				.userMessage(MSG_GENERIC_FINAL_USER_ERROR).build();
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problem);
	}
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<Object> handleBusinessException(BusinessException e){
		Problem problem = Problem.builder()
				.timestamp(LocalDateTime.now())
				.type(e.getClass().getSimpleName())
				.userMessage(e.getMessage()).build();
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(problem);
	}
	
	@ExceptionHandler(IsbnNotFoundException.class)
	public ResponseEntity<Object> handleIsbnNotFoundException(IsbnNotFoundException e){
		Problem problem = Problem.builder()
				.timestamp(LocalDateTime.now())
				.type(e.getClass().getSimpleName())
				.userMessage(e.getMessage()).build();
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(problem);
	}
}