package com.lijia.execption;

public class AgeException extends StudentException {
	private static final long serialVersionUID = 1L;
	
	public AgeException(){
		super();
	}
	public AgeException(String message){
		super(message);
	}

}
