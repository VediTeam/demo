package com.sgic.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="SchoolName" ,length = 100)
    private String name;

    @Column(name="Address" , length =100)
    private String Address;

    @OneToMany(mappedBy = "school",cascade = CascadeType.ALL)
    private List <Student> students;

}
