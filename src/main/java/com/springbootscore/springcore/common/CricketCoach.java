package com.springbootscore.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "He will sleep for 15 minutes. >:)";
    }

}
