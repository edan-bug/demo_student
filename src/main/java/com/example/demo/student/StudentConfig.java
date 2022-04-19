package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
              Student Edan = new Student(
                            "Edan",
                            "edansalam@gmail.com",
                            LocalDate.of(2000, Month.JANUARY, 5)

                    );
              Student Jamal = new Student(
                    "Jamal",
                    "jamal@gmail.com",
                    LocalDate.of(1991, Month.JANUARY, 5)
                    );
              repository.saveAll(
                      List.of(Edan,Jamal)
              );
        };
    }
}
