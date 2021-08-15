package com.boogiepizza.BoogiePizza;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoogiePizzaApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(BoogiePizzaApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
