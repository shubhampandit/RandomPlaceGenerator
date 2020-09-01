package com.uselesstech.randomplacegenerator.error;

import com.uselesstech.randomplacegenerator.entity.PlacesAPIError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
        PlacesAPIError placesAPIError = new PlacesAPIError(HttpStatus.INTERNAL_SERVER_ERROR,
                ex.getLocalizedMessage(), "Error Occurred!");

        return new ResponseEntity<Object>(placesAPIError, new HttpHeaders(), placesAPIError.getStatus());
    }
}
