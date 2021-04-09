package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    // field injection with java reflection
    @Autowired
    private FortuneService fortuneService;

    // default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }

   /* // define the setter method for injections
    @Autowired
    public void doSomeCrazyStuff( FortuneService theFortuneService){
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService = theFortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
