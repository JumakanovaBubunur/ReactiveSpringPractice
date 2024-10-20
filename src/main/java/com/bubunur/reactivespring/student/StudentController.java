package com.bubunur.reactivespring.student;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public Mono<Student> addStudent(@RequestBody Student student) {
       return studentService.save(student);
    }

    @GetMapping
    public Flux<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> getStudentById(@PathVariable("id") Integer id) {
        return studentService.findById(id);
    }

    @GetMapping("/{firstname}")
    public Flux<Student> getStudentByFirstname(@PathVariable("firstname") String firstname) {
        return studentService.findByFirstname(firstname);
    }
}
