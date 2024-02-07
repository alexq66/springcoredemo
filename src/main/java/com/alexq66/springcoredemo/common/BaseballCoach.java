package com.alexq66.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements CoachInterface {

    @Override
    public String getDailyWorkout() {
        return "Practice hitting for 30 minutes.";
    }
}
