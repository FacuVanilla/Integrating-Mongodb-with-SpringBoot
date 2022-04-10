package com.seun.mongod.exceptions;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
