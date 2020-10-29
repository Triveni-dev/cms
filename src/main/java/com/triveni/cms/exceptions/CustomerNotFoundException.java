package com.triveni.cms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class CustomerNotFoundException extends RuntimeException {
    //404 error
    public CustomerNotFoundException(String message){
        super(message);
    }

}
