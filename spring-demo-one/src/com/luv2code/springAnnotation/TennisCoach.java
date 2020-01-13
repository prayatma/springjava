package com.luv2code.springAnnotation;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "practice serving for 1 hour.";
    }
}
