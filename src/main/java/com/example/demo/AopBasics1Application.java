package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.business.Business1;
import com.example.demo.business.Business2;

@SpringBootApplication
public class AopBasics1Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(AopBasics1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("{}",business1.getData());
		logger.info("{}",business2.getData());
	}

}
