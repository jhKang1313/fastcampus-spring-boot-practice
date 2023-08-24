package com.fastcampus.springbootpractice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("my")
public class MyProperties {
    private final Integer height;
    private final Integer weight;
    private final String name;

    public MyProperties(Integer height, Integer weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }
    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
