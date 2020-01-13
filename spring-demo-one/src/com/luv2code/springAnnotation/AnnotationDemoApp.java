package com.luv2code.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAnnotation-applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();

    }
}
