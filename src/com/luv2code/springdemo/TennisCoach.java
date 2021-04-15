package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{


    @Autowired                           // field injection with java reflection
    @Qualifier("randomFortuneService")   // Let spring know the bean id - in case for autowiring multiple implementations
    private FortuneService fortuneService;

    // default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }


    // define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach: inside of doMyStartupStuff");
    }
    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff");
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
