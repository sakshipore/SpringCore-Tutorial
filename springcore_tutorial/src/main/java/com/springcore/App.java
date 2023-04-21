package com.springcore;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("studentBean");

        System.out.println(student);
    }
}
