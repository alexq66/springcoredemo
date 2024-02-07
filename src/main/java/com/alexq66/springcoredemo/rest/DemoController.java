package com.alexq66.springcoredemo.rest;

import com.alexq66.springcoredemo.common.CoachInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kenneth Quinn on 2/7/2024
 */

@RestController
public class DemoController {

    private CoachInterface myCoach;

//Constructor Injection Method - included as an example
 /**
  * @Autowired
    public DemoController(CoachInterface theCoach) {
        myCoach = theCoach;
    }
 */

 //Setter Injection Method

    @Autowired
    public void setMyCoach(CoachInterface theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
