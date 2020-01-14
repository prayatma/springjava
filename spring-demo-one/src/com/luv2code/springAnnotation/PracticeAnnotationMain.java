package com.luv2code.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext practice = new ClassPathXmlApplicationContext("springAnnotation-applicationContext.xml");

        Coach theCoach = practice.getBean("practice", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        practice.close();

    }
}
