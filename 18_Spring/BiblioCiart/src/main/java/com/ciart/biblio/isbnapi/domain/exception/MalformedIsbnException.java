package com.ciart.biblio.isbnapi.domain.exception;

public class MalformedIsbnException extends BusinessException{

	private static final long serialVersionUID = 1L;

	public MalformedIsbnException(String message) {
		super(message);
	}
}
