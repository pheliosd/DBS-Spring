package com.dbs.app;

import com.dbs.beans.ConsoleRenderer;
import com.dbs.beans.HelloMessageRenderer;
import com.dbs.beans.MessageProvider;
import com.dbs.beans.MessageRenderer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MessageRenderer renderer = new ConsoleRenderer();
        MessageProvider provider = new HelloMessageRenderer();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
