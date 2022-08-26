package com.example.animal.exceptions;
import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "animal does not exist with that Tag")
public class AnimalNotFoundID extends EntityNotFoundException{}

