package com.zup.orange.exceptions;

public class ExceptionResponse {
	private String message;
    private Integer status;
  
    public ExceptionResponse(String message,Integer status) {
    	this.message = message;
    	this.status=status;
    }
  
    public Integer getStatus() {
    	return status;
    }

  
    public String getMessage() {
    	return message;
    }
}
