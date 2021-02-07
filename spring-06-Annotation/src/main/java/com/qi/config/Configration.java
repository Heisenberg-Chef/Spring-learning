package com.qi.config;

import com.qi.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.qi")
@Import(Config2.class)
public class Configration {
    @Bean
    public User getUser()
    {
        return new User();
    }
}
