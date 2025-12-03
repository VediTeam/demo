package com.sgic.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CompositeType;

import java.util.List;

@Entity
//@Table(name="Students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private Long id;
     @Column(name="fristName" ,length =100)
     private String fName;

     @Column(name ="lastName" ,length=100)
     private String lName;

     @Column(name="email",unique = true)
     private String email;

     @Column(name="age")
     private int age;

     @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
     private StudentProfile studentProfile;

     @ManyToOne
     @JoinColumn(name="School_id")
    private School school;

     @ManyToMany
     @JoinTable(
         name="student_course",
         joinColumns = @JoinColumn(name="student_id"),
         inverseJoinColumns = @JoinColumn(name="coruse_id")
     )
     private List <Course> courses;


}
