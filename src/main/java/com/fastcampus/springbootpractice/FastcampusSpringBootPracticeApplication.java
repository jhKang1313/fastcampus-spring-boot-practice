package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.MyProperties;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ConfigurationPropertiesScan
public class FastcampusSpringBootPracticeApplication {

	private final Integer height;
	private final Environment environment;
	private final ApplicationContext applicationContext;
	private final MyProperties myProperties;
	public FastcampusSpringBootPracticeApplication(
			@Value("${my.height}") Integer height,
			Environment environment,
			ApplicationContext applicationContext,
			MyProperties myProperties) {
		this.height = height;
		this.environment = environment;
		this.applicationContext = applicationContext;
		this.myProperties = myProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);
	}
	@PostConstruct
	public void init(){
		System.out.println("Value : " + height);
		System.out.println("Enviroment : " + environment.getProperty("my.height"));
		System.out.println("ApplicationContent : " + applicationContext
				.getEnvironment()
				.getProperty("my.height"));
		System.out.println("ConfigurationProp : " + myProperties.getHeight());
		System.out.println("ConfigurationProp : " + myProperties.getWeight());
		System.out.println("ConfigurationProp : " + myProperties.getName());
	}


}
