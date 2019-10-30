package com.jujianfei.spring;

/**
 * Spring 5 高级编程
 *
 * @author Jeffery_Ju@163.com
 * @date 2019-10-30 10:57:49
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "hello world";
    }
}
