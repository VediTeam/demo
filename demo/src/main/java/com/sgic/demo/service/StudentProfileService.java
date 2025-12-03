package com.sgic.demo.service;

import com.sgic.demo.dto.StudentProfileDto;
import java.util.List;

public interface StudentProfileService {

    StudentProfileDto createProfile(StudentProfileDto studentProfileDto);

    List<StudentProfileDto> getAllProfiles();

    StudentProfileDto getProfileById(Long id);

    StudentProfileDto updateProfile(Long id, StudentProfileDto studentProfileDto);

    boolean deleteProfile(Long id);
}
