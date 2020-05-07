package com.zz.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.io.Serializable;

@ControllerAdvice
public class ServiceException extends RuntimeException {
    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

}
