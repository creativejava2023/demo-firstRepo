package com.SpringJpaProgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("module-service")
public class H2ProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2ProgramApplication.class, args);
	}

}
