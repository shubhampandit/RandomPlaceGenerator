package com.uselesstech.randomplacegenerator.error;

public class PlaceNotFoundException extends RuntimeException{
    public PlaceNotFoundException(String message){
        super(message);
    }
}
