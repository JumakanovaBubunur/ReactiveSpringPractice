package com.bubunur.reactivespring.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table(name = "students")
public class Student {
    @Id
    private Integer id;
    private String firstname;
    private String surname;
    private Byte age;
}
