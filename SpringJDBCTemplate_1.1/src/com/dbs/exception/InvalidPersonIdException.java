package com.dbs.exception;

public class InvalidPersonIdException extends Exception{
    public InvalidPersonIdException() {
    }

    public InvalidPersonIdException(String message) {
        super(message);
    }

    public InvalidPersonIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPersonIdException(Throwable cause) {
        super(cause);
    }
}
