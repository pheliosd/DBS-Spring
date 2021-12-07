package com.dbs.app;
//import org.apache.log4j.Logger;

import com.dbs.beans.PrimeCheck;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        static Logger log = Logger.getLogger(MainApp.class.getName());

        // public static void main (String[]args){
        System.out.println("Hello World!");
        PrimeCheck primeCheck = new PrimeCheck();
        System.out.println("17" + primeCheck.check(17));
        // }


//        System.out.println( "Hello World!" );
    }
}
