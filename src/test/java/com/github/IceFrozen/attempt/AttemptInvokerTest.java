package com.github.IceFrozen.attempt;

import com.github.IceFrozen.attempt.exception.SneakyExceptionUtil;

import com.github.IceFrozen.attempt.testBean.StaticMethodThrowExceptionBean;
import org.junit.Assert;
import org.junit.Test;

public class AttemptInvokerTest {
    public static Throwable origin;

    @Test
    public void testSneakyExceptionUtil() {
        try {
            throwException();
        } catch (Exception e) {
            Assert.assertSame(origin, e);
        }
    }

    public static void throwException() {
        try {
            Object o = StaticMethodThrowExceptionBean.throwException();
        } catch (Exception e) {
            origin = e;
            SneakyExceptionUtil.sneakyThrow(e);
        }
    }

}