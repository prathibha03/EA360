package com.ea360.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EA360ModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EA360ModuleApplication.class, args);
	}

}
