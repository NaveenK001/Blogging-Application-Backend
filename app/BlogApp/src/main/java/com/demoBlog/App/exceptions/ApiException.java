package com.demoBlog.App.exceptions;

public class ApiException extends RuntimeException{

    public ApiException(String message) {
        super(message);

    }

    public ApiException() {
        super();

    }
}
