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

    @ExceptionHandler(PlaceNotFoundException.class)
    public ResponseEntity<Object> handlePlaceNotFoundException(Exception ex, WebRequest request) {
        PlacesAPIError placesAPIError = new PlacesAPIError(HttpStatus.NOT_FOUND,
                ex.getLocalizedMessage(), "Place Not Found!");
        return new ResponseEntity<Object>(placesAPIError, new HttpHeaders(), placesAPIError.getStatus());
    }
}
