package com.auth0.questionmark;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class RestException extends RuntimeException {
    @Getter
    private String message;

    @Getter
    private Object[] args;
}
