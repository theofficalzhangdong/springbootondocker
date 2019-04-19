package com.example.mydocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * the main of this program
 *
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:application-bean.xml"})
public class MydockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydockerApplication.class, args);
	}

}
