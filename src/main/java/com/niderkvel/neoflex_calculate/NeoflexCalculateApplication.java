package com.niderkvel.neoflex_calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NeoflexCalculateApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeoflexCalculateApplication.class, args);
	}
}
