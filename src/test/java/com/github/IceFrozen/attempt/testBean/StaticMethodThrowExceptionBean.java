package com.github.IceFrozen.attempt.testBean;

public class StaticMethodThrowExceptionBean {

    public static int count;

    public static Object throwException() throws Exception {
        count++;
        throw new Exception("StaticMethodThrowExceptionBean's throwException");
    }

}
