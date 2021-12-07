package com.dbs.helper;

import com.dbs.beans.ConsoleMessageRenderer;
import com.dbs.beans.HelloMessageRenderer;
import com.dbs.beans.MessageProvider;
import com.dbs.beans.MessageRenderer;

public class MessageFactory {

MessageProvider messageProvider=null;
MessageRenderer messageRenderer=null;

    public static MessageProvider getMessageProvider() {
        return messageProvider = new HelloMessageRenderer();
    }



    public static MessageRenderer getMessageRenderer() {
        return messageRenderer= new ConsoleMessageRenderer();
    }



    static  MessageFactory messageFactory= null;

    private MessageFactory(){}
    public static MessageFactory getInstance(){
        if( messageFactory == null ){
            System.out.println("Instancing and returning ");
            messageFactory = new MessageFactory();
        return  messageFactory;
        }
        else {
            System.out.println("Returning an existing instance reference");
            return messageFactory;
        }
    }
}
