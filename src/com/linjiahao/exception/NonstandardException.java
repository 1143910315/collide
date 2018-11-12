package com.linjiahao.exception;

public class NonstandardException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1919255910040061078L;
	
	public NonstandardException() {
	}
	
	public NonstandardException(String message) {
		super(message);
	}
	
	public NonstandardException(Throwable cause) {
		super(cause);
	}
	
	public NonstandardException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public NonstandardException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
