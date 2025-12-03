package com.sgic.demo.mapper;

import com.sgic.demo.dto.StudentProfileDto;
import com.sgic.demo.entity.StudentProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface  StudentProfileMapper {

    StudentProfileDto toDto(StudentProfile studentProfile);
    StudentProfile toEntity(StudentProfileDto studentProfileDto);

}
