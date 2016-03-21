package com.javaindepth.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaindepth.springhibernate.beans.Account;
import com.javaindepth.springhibernate.beans.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService=(UserService)context.getBean("usr");
        //creates user object
        User userobj=new User();
        userobj.setName("test user");
        userobj.setEmail("testemail@gmail.com");
        //insert user to database
        userService.addUser(userobj);

        //insert accounts . .
        
        AccountService accService=(AccountService)context.getBean("accService");
        
        Account acc=new Account();
        acc.setAccount_number("1212121Aass");
        acc.setAccount_type("Savings");
        acc.setUser(userobj);
        
        System.out.println(accService.listAllAccounts().get(0));
        
        
    }
}
