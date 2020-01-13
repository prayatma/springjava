package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivityThree {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("practiceActivityThree-applicationContext.xml");

        BasketballCoach  bk = context.getBean("myBasketballCoach", BasketballCoach.class);

        BasketballCoach bk1 = context.getBean("myBasketballCoach", BasketballCoach.class);

        boolean result = (bk == bk1);

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nPointing to the bk object: " + bk);

        System.out.println("\nPointing to the bk1 object: " + bk1 + "\n");

        System.out.println(bk.getDailyWorkout());

        context.close();
    }
}
