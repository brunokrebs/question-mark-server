package com.auth0.questionmark.util;

import com.auth0.questionmark.RestException;
import com.auth0.questionmark.exam.Exam;

public final class Check {
    public static void isNotNull(Exam exam, String message, Object... args) {
        if (exam == null) {
            throw new RestException(message, args);
        }
    }
}
