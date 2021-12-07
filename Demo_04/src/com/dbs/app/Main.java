package com.dbs.app;

import com.dbs.beans.ConsoleMessageRenderer;
import com.dbs.beans.HelloMessageRenderer;
import com.dbs.beans.MessageProvider;
import com.dbs.beans.MessageRenderer;
import com.dbs.helper.MessageFactory;

public class Main {

//    Hard Coded Dependencies

    public static void main(String[] args) {
        // write your code here
        MessageRenderer renderer = MessageFactory.getMessageRenderer();
        MessageProvider provider = MessageFactory.getMessageProvider();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
