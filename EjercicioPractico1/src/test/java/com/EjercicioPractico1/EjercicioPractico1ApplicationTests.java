package com.EjercicioPractico1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

@SpringBootTest
class EjercicioPractico1ApplicationTests {
    
    @GetMapping("/hello")
        public String hello(){
            return "hola mundo tooo";
        }
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPractico1Application.class, args);
                
	}

	@Test
	void contextLoads() {
	}

}
