package com.market.tutoringsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TutoringSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutoringSystemApplication.class, args);
	}

}
