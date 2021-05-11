package com.example;


import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;
import java.util.ArrayList;


@SpringBootApplication
public class Restapi {

     public static void main(String[] args) {
         //set config
        // Config cfg = new Config();
        // cfg.setName();

        ConfigurableApplicationContext run = SpringApplication.run(Restapi.class,args);
        //test import configure
         ArrayList<Integer> list = new ArrayList<>();
        /*
        String beanname[] = run.getBeanDefinitionNames();
         for (String s : beanname) {
             System.out.println(s);
         } */
    }
}
