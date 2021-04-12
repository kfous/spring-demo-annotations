package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    // default constructor
    public SwimCoach(){
        System.out.println(">> SwimCoach: inside default constructor");
    }


    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 m to warm up a bit";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
