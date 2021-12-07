package com.dbs.beans;

public class HelloMessageRenderer implements MessageProvider{

    @Override
    public String getMessage() {
        return "Hello Folks...!";
    }
}
