package com.github.IceFrozen.attempt.exception;

import java.lang.reflect.Method;

public class NotImplementedException extends ProxyException {
    public NotImplementedException(Method method) {
        super("Not implemented method: " + method);
    }
}
