package com.ejemplo.springboot.reactor.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;


@SpringBootApplication
public class SpringBootReactorApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(SpringBootReactorApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Flux<String> letters = Flux.just("A", "B", "C", "D")
			.doOnNext(System.out::println);
		
			letters.subscribe(log::info);
	}

}
