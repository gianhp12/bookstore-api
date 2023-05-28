package com.curso.angularspring.service.exceptions;

public class DataIntegrationViolationException extends RuntimeException{
    public DataIntegrationViolationException(String message) {
        super(message);
    }

    public DataIntegrationViolationException(String message, Throwable cause) {
        super(message, cause);
    }
}
