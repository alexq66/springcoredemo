package com.alexq66.springcoredemo.common;

import org.springframework.stereotype.Component;

/**
 * Created by Kenneth Quinn on 2/7/2024
 */
@Component
public class CricketCoach implements CoachInterface{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
