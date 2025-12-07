package com.onlineordersystem.onlineordersystem.exception.ControllerExceptionHandler;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResourceNotFoundHandler extends RuntimeException{

    private String msg;
    public ResourceNotFoundHandler(String msg)
    {
        super(msg);
        this.msg = msg;
    }

}
