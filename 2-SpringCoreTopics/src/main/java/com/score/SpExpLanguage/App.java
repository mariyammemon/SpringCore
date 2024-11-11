package com.score.SpExpLanguage;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args ) throws Exception
    {
       // System.out.println( "Hello World!" );
        context = new ClassPathXmlApplicationContext("com/score/SpExpLanguage/config1.xml");
        Exp s1=(Exp)context.getBean("exp");
        System.out.println(s1);
        
        
    }
}
