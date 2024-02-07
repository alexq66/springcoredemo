package com.alexq66.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements CoachInterface {

    @Override
    public String getDailyWorkout() {
        return "Practice hitting for 30 minutes";
    }
}
