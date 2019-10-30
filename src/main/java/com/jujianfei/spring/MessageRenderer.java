package com.jujianfei.spring;

/**
 * Spring 5 高级编程
 *
 * @author Jeffery_Ju@163.com
 * @date 2019-10-30 10:54:52
 */
public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider messageProvider);


    MessageProvider getMessageProvider();
}
