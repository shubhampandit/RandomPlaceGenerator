package com.uselesstech.randomplacegenerator.entity;

import org.springframework.http.HttpStatus;

public class PlacesAPIError {
    private HttpStatus status;
    private String message;
    private String error;

    public PlacesAPIError(HttpStatus status, String message, String error) {
        this.status = status;
        this.message = message;
        this.error = error;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
