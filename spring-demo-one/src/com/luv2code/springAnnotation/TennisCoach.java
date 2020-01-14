package com.luv2code.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // set default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
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

    // define my init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMYCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }


    @Override
    public String getDailyWorkout() {
        return "practice serving for 1 hour.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
