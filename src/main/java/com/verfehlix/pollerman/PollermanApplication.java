package com.verfehlix.pollerman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import twitter4j.TwitterException;


@SpringBootApplication
@EnableScheduling
public class PollermanApplication {

	public static void main(String[] args) {

		SpringApplication.run(PollermanApplication.class, args);


	}


}

