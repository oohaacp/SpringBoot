package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication
public class MuzixApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MuzixApplication.class, args);

	}

}
