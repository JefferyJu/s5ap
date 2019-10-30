package com.jujianfei.spring;

/**
 * Spring 5 高级编程
 *
 * @author Jeffery_Ju@163.com
 * @date 2019-10-30 10:52:49
 */
public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) {
        MessageSupportFactory factory = MessageSupportFactory.getInstance();
        MessageProvider mp = factory.getMessageProvider();
        MessageRenderer mr = factory.getMessageRenderer();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
