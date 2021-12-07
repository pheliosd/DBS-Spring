package com.dbs.app;

import com.dbs.helper.MessageFactory;

public class FactoryTester {
    public static void main(String[] args) {
        MessageFactory messageFactory1 = MessageFactory.getInstance();
        MessageFactory messageFactory2 = MessageFactory.getInstance();
        if(messageFactory2 == messageFactory1){
            System.out.println("Same Object");;
        }
        else{
            System.out.println("Different Objects");
            //for reference why they are different
            System.out.println(messageFactory1);
            System.out.println(messageFactory2);
        }

    }
}
