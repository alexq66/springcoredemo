package com.alexq66.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements CoachInterface {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }
}
