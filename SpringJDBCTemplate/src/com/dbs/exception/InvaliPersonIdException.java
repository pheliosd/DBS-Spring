package com.dbs.exception;

public class InvaliPersonIdException extends Exception{
    public InvaliPersonIdException() {
    }

    public InvaliPersonIdException(String message) {
        super(message);
    }

    public InvaliPersonIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvaliPersonIdException(Throwable cause) {
        super(cause);
    }
}
