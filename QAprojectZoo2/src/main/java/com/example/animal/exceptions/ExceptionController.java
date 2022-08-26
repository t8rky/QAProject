package com.example.animal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	 @ExceptionHandler(value = AnimalNotFoundID.class)
	   public ResponseEntity<Object> exception(AnimalNotFoundID exception) {
	      return new ResponseEntity<>("Animal Not Found. Please enter the right ID", HttpStatus.NOT_FOUND);
	   }


}
