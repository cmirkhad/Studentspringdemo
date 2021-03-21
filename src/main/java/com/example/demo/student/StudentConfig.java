package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
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
            repository.saveAll(List.of(alex, mariam));
        };
    }
}
