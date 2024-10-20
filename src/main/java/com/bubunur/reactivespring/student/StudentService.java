package com.bubunur.reactivespring.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Flux<Student> findAll() {
        return studentRepository.findAll();
    }
    public Flux<Student> findByFirstname(String name) {
        return studentRepository.findByFirstnameIgnoreCase(name);
    }

    public Mono<Student> findById(Integer id) {
        return studentRepository.findById(id);
    }
    public Mono<Student> save(Student student) {
        return studentRepository.save(student);
    }

}
