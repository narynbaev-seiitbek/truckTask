package com.company.exceptions;

import java.io.FileNotFoundException;

public class JsonFileNotFoundException extends RuntimeException {

    public JsonFileNotFoundException() {
    }

    public JsonFileNotFoundException(String message) {
        super(message);
    }
}
