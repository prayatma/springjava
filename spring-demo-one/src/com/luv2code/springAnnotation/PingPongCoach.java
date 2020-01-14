package com.luv2code.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    private PingPongCoach() {
        System.out.println(">> PingPongCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice you ping pong drop shot";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
