package com.ejemplo.appjar;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppjarApplication {
	public static void main(String[] args) {
		// SpringApplication.run(AppjarApplication.class, args);
		SpringApplication app = new SpringApplication(AppjarApplication.class);

		Properties properties = new Properties();
		properties.setProperty("spring.resources.static-locations",
				"classpath:/view/");
		app.setDefaultProperties(properties);
		app.run(args);
	}
}
