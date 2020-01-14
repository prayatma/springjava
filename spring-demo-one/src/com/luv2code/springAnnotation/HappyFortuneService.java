package com.luv2code.springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You luck is rendered by Annotations in HappyFortuneService.";
    }
}
