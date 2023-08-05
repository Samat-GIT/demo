package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->  {
            Student samat = new Student(
                    "Samat",
                    "samat@mail.ru",
                    LocalDate.of(1999, FEBRUARY, 1)
            );

            Student mamat = new Student(
                    "Mamat",
                    "Mamat@mail.ru",
                    LocalDate.of(1999, DECEMBER, 2)
            );

            repository.saveAll(
                    List.of(samat,mamat)
            );
        };
    }
}
