package com.alexq66.springcoredemo.common;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Kenneth Quinn on 2/7/2024
 */

public class SwimCoach implements CoachInterface {

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }
}
