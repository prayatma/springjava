package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

    FortuneService fortuneService;

    BasketballCoach (FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "3 point shootout practice for 30 min.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // init method
    public void initMethod(){
        System.out.println("Basketball Coach: initMethod");
    }

    // destroy method
    public void destroyMethod(){
        System.out.println("Basketball Coach: destroyMethod");
    }
}
