package com.bubunur.reactivespring.student;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
@Table(name = "students")
public class Student {
    @Id
    private Integer id;
    private String firstname;
    private String surname;
    private Byte age;
}
