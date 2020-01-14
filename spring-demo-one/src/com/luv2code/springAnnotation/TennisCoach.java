package com.luv2code.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // set default constructor
    public TennisCoach(){
        System.out.println(">> inside default constructor");
    }
/*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    // define a setter method
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        fortuneService = theFortuneService;
    }

    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService = theFortuneService;
    }

 */


    @Override
    public String getDailyWorkout() {
        return "practice serving for 1 hour.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
