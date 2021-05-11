package com.example;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mycar")
@Data
public class Cars {
    private String name;
    private String brand;
    private  int price;
}
