package com.sgic.demo.entity;

import jakarta.persistence.*;

import javax.lang.model.element.Name;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="courseName" ,length = 100)
    private String CourseName;

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    private List<Student> students;
}
