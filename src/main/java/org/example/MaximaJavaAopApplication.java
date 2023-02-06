package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaximaJavaAopApplication implements CommandLineRunner {
	@Autowired
	private Cat cat;
	public static void main(String[] args) {
		SpringApplication.run(MaximaJavaAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, AOP");

		cat.eat();
		cat.sleep();
		cat.jump();
		cat.crush();
	}
}
