package com.maven.spring;

import com.maven.spring.bean.Address;
import com.maven.spring.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //BeansFactory
        //ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        /*Customer customer = context.getBean("customer1",Customer.class);
        Customer customer2 = context.getBean("customer2",Customer.class);
        Customer customer3 = context.getBean("customer3",Customer.class);
        System.out.println(customer);
        System.out.println(customer2);
        System.out.println(customer3);
        Address shippingAddress = context.getBean("shippingAddress",Address.class);
        System.out.println(shippingAddress);*/

       Customer customer5 = context.getBean("customer5",Customer.class);
       System.out.println(customer5);

       Customer customer6 = context.getBean("customer5",Customer.class);
        System.out.println(customer5==customer6);


        Address shippingAddress =context.getBean("shippingAddress",Address.class);
        System.out.println(shippingAddress);

        Address residentialAddress = context.getBean("residentialAddress",Address.class);
        System.out.println(residentialAddress);

    }
}
