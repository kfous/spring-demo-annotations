package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        SwimCoach2 theCoach = context.getBean("swimCoach2", SwimCoach2.class);

        // SoccerPlayer example
        // Coach theCoach2 = context.getBean("soccerCoach",Coach.class);
        // System.out.println(theCoach2.getDailyWorkout());

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call our new swim coach methods ... has the props values injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        // close the context
        context.close();
    }
}
