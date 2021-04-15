package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {


   private FortuneService fortuneService;


    // default constructor
    public SwimCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;

       // System.out.println(">> SwimCoach: inside default constructor");
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
