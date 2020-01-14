package com.luv2code.springAnnotation;

import org.springframework.stereotype.Component;

@Component("practice")
public class PracticeAnnotation implements Coach {

    FortuneService fortuneService;


    @Override
    public String getDailyWorkout() {
        return "Practice coding everyday minimum 2 hours.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
