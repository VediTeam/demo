package com.sgic.demo.service;

import com.sgic.demo.dto.SchoolDto;
import com.sgic.demo.entity.School;

import java.util.List;

public interface SchoolService {
    SchoolDto createSchool(SchoolDto schoolDto);
    List<SchoolDto> getAllSchools();
    SchoolDto getSchoolById(Long id);
    SchoolDto updateSchool(Long id, SchoolDto schoolDto);
    boolean deleteSchool(Long id);
}
