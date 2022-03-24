package com.calculator.service.exception;

public class InvalidOperationException extends Exception {
    public InvalidOperationException(String errorMessage) {
        super(errorMessage);
    }
}
