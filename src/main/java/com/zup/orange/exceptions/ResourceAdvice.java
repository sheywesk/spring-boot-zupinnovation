package com.zup.orange.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ResourceAdvice {
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ExceptionResponse> notfound() {
		ExceptionResponse exception = new ExceptionResponse("Usuário não encontrado", 404);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception);
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(UserBadRequestException.class)
	public ResponseEntity<ExceptionResponse> badRequest(){
		ExceptionResponse exception = new ExceptionResponse("Erros nos campos inseridos", 400);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception);
	}
	
	@ResponseStatus(value = HttpStatus.CONFLICT)
	@ExceptionHandler(UserConflictException.class)
	public ResponseEntity<ExceptionResponse> conflict() {
		ExceptionResponse exception = new ExceptionResponse("Usuário já existe", 409);
		return ResponseEntity.status(HttpStatus.CONFLICT).body(exception);
	}

}
