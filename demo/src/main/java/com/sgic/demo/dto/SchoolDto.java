package com.sgic.demo.dto;

import com.sgic.demo.utils.ValidationMessages;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolDto {

    private Long id;

    @NotBlank(message = ValidationMessages.VALIDATION_FAILED)
    @Size(max=255)
    private String name;

    private String address;

 private String age;
}
