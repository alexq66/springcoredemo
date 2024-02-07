package com.alexq66.springcoredemo.config;

import com.alexq66.springcoredemo.common.CoachInterface;
import com.alexq66.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Kenneth Quinn on 2/7/2024
 */
@Configuration
public class SportConfig {

    @Bean
    public CoachInterface swimCoach() {
        return new SwimCoach();
    }
}
