package com.qi.config;

import com.qi.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
    @Bean
    public User getUser2()
    {
        return new User("abc");
    }
}
