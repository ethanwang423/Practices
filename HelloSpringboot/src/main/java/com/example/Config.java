package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(name = "condition11")
public class Config {
   //
    @Bean
    public  String setName(){
        System.out.println("Set config....");
        return "SetName bean done";
    }
    //
    @Bean("condition")
    public String  getName(){
        return  new String();
    }


}
