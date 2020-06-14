package com.haapp.module041;

public class BracketException extends Exception{

    public BracketException(String message){
        super("ERROR: " + message);
    }
}
