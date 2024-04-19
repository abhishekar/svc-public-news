package com.news.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MissingRequestParameterException extends RuntimeException {

    public MissingRequestParameterException(String parameterName) {
        super(String.format("Missing required request parameter: '%s'", parameterName));
    }

}
