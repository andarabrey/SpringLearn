package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//        return args -> {
//            Student breygas = new Student(
//                    "Breygas",
//                    "andarabrey@gmail.com",
//                    LocalDate.of(1994, Month.JUNE, 30)
//            );
//            Student andara = new Student(
//                    "Andara",
//                    "andarabrey@gmail.com",
//                    LocalDate.of(1999, Month.JUNE, 30)
//            );
//
//            studentRepository.saveAll(
//                    List.of(breygas, andara)
//            );
//        };
//    }
}
