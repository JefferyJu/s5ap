package com.jujianfei.spring;

import java.util.Properties;

/**
 * Spring 5 高级编程
 *
 * @author Jeffery_Ju@163.com
 * @date 2019-10-30 11:14:29
 */
public class MessageSupportFactory {

    private static MessageSupportFactory instance;
    private Properties props;
    private MessageProvider provider;
    private MessageRenderer renderer;


    private MessageSupportFactory() {
        props = new Properties();
        try {
            props.load(this.getClass().getResourceAsStream("/msf.properties"));
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }


    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }


}
