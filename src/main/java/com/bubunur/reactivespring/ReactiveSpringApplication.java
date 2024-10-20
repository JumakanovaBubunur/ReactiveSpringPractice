package com.bubunur.reactivespring;

import com.bubunur.reactivespring.student.Student;
import com.bubunur.reactivespring.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentService studentService) {
      return args ->{
            for (int i = 0; i < 100; i++) {
               studentService.save(Student.builder()
                               .firstname("Bubunur-"+i)
                               .surname("ReactiveSpring"+i)
                               .age((byte) i)
                       .build()).subscribe();
            }
        };
    }

}
