package com.ciart.biblio.isbnapi.domain.exception;

public class IsbnInvalid extends BusinessException{

	private static final long serialVersionUID = 1L;
	
	public IsbnInvalid(String message) {
		super(message);
	}

}