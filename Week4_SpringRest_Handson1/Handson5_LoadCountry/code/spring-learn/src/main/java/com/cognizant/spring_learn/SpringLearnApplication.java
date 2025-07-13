package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		displayCountry();
	}

	public static void displayCountry() {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
			Country country = context.getBean("country", Country.class);
			System.out.println("Country loaded: " + country);
			LOGGER.debug("Country : {}", country);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
