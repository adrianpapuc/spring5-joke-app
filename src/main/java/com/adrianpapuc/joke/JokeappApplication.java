package com.adrianpapuc.joke;

import com.adrianpapuc.joke.controllers.JokeController;
import com.adrianpapuc.joke.services.JokeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
        System.out.println("Finish");
    }

}
