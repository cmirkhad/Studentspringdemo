package com.example.demo.student;

import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import java.util.List;


import static java.time.Month.*;

@Configuration
public class StudentConfig {
    private static final Logger logger = LoggerFactory.getLogger(StudentConfig.class);
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",

                    LocalDate.of(2000, FEBRUARY, 19),
                    "mama@gmail.com"
            );
            Student alex = new Student(
                    "Alex",

                    LocalDate.of(2007, FEBRUARY, 19),
                    "alex@gmail.com"
            );
            logger.info("info" + repository.save(mariam));
        };
    }
}
