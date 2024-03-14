package com.sena.OktoDesigns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class OktoDesignsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktoDesignsApplication.class, args);
	}

}
