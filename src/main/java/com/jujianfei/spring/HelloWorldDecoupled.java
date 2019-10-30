package com.jujianfei.spring;

/**
 * Spring 5 高级编程
 *
 * @author Jeffery_Ju@163.com
 * @date 2019-10-30 14:05:41
 */
public class HelloWorldDecoupled {

    public static void main(String[] args) {
        MessageProvider mp = new HelloWorldMessageProvider();
        MessageRenderer mr = new StandardOutMessageRenderer();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
