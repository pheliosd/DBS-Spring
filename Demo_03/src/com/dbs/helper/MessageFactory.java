package com.dbs.helper;

public class MessageFactory {

//    Singleton design pattern

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
