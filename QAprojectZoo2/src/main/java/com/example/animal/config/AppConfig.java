package com.example.animal.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public String greeting() {
		return "hello my freiend";
	}

	 @Bean
	    public ModelMapper mapper() {
	        return new ModelMapper();
	    }
}
