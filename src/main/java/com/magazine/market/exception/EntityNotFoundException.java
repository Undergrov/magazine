package com.magazine.market.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException() {super("Entity not found");}


    public EntityNotFoundException(String message){super(message);}
    public EntityNotFoundException(String message, Throwable cause){super(message, cause);}
    public EntityNotFoundException(Throwable cause){super(cause);}

    protected EntityNotFoundException(String message, Throwable cause,
                                      boolean enableSuppresion,
                                      boolean writableStackTrace){
        super(message, cause, enableSuppresion, writableStackTrace);
    }
}
