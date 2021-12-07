package com.dbs;
//import org.apache.log4j.Logger;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        static Logger log = Logger.getLogger(MainApp.class.getName());

        public static void main (String[]args){
            ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
            log.info("Going to create HelloWord Obj");
            HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
            obj.getMessage();

            log.info("Exiting the program");
        }


//        System.out.println( "Hello World!" );
    }
}
