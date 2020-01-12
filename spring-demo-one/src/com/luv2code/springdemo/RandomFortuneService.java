package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "The journey is the reward.",
            "You will be rewarded for you successs.",
            "You will get a job ASAP!."
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array

        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
