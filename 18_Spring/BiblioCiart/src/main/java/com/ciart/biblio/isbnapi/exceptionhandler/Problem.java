package com.ciart.biblio.isbnapi.exceptionhandler;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Problem {

	private LocalDateTime timestamp;
	private String type;
	private String userMessage;
}
