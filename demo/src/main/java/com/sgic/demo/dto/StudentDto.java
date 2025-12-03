package com.sgic.demo.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@AllArgsConstructor
public class StudentDto {
}
