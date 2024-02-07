package com.alexq66.springcoredemo.rest;

import com.alexq66.springcoredemo.common.CoachInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kenneth Quinn on 2/7/2024
 */

@RestController
public class DemoController {

    private CoachInterface myCoach;

//Constructor Injection Method
//This method is the preferred Injection method and is required when there are required dependencies.
    @Autowired
    public DemoController(@Qualifier("aquatic") CoachInterface theCoach) {
        myCoach = theCoach;
    }


 //Setter Injection Method - this method is used when there are optional dependencies.
/*
    @Autowired
    public void setMyCoach(CoachInterface theCoach){
        myCoach = theCoach;
    }
*/
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
