package com.netplus.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetplusApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NetplusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
	}	
}
