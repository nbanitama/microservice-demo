package com.example.demo.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by noba on 12/10/2017.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException(String pesel){
        super("No such customer : " + pesel);
    }
}