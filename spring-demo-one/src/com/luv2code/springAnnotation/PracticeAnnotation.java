package com.luv2code.springAnnotation;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("practice")
public class PracticeAnnotation implements Coach {

    FortuneService fortuneService;

    private String data[] = {
            "Annotation practice",
            "Dependency injection with Annotations",
            "Fortune Implementation Annotations"
    };

    private Random random = new Random();



    @Override
    public String getDailyWorkout() {
        return "Practice coding everyday minimum 2 hours.";
    }

    @Override
    public String getDailyFortune() {

        int num = random.nextInt(data.length);
        String fortune = data[num];
        return fortune;
    }

}
