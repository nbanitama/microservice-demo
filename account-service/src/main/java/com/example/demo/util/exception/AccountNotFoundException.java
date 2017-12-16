package com.example.demo.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by noba on 12/10/2017.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public AccountNotFoundException(String accountNumber){
        super("No such account : " + accountNumber);
    }

}
