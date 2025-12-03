package com.sgic.demo.service;

import com.sgic.demo.dto.SchoolDto;
import com.sgic.demo.entity.School;
import com.sgic.demo.repository.SchoolRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRespository schoolRespository;

    @Override
    public SchoolDto createSchool(SchoolDto schoolDto) {
        School school = new School();
        school.setName(schoolDto.getName());
        school.setAddress(schoolDto.getAddress());
        School saved = schoolRespository.save(school);
        return new SchoolDto(saved.getId(), saved.getName(), saved.getAddress());
    }

    @Override
    public List<SchoolDto> getAllSchools() {
        List<School> schools = schoolRespository.findAll();
        return schools.stream()
                .map(s -> new SchoolDto(s.getId(), s.getName(), s.getAddress()))
                .collect(Collectors.toList());
    }

    @Override
    public SchoolDto getSchoolById(Long id) {
        Optional<School> schoolOpt = schoolRespository.findById(id);
        if (schoolOpt.isPresent()) {
            School school = schoolOpt.get();
            return new SchoolDto(school.getId(), school.getName(), school.getAddress());
        } else {
            return null; // or throw new ResourceNotFoundException("School not found with id " + id);
        }
    }

    @Override
    public SchoolDto updateSchool(Long id, SchoolDto schoolDto) {
        Optional<School> optionalSchool = schoolRespository.findById(id);
        if (optionalSchool.isPresent()) {
            School existingSchool = optionalSchool.get();
            existingSchool.setName(schoolDto.getName());
            existingSchool.setAddress(schoolDto.getAddress());
            School updatedSchool = schoolRespository.save(existingSchool);
            return new SchoolDto(updatedSchool.getId(), updatedSchool.getName(), updatedSchool.getAddress());
        } else {
            return null; // or throw new ResourceNotFoundException("School not found with id " + id);
        }
    }

    @Override
    public boolean deleteSchool(Long id) {
        if (schoolRespository.existsById(id)) {
            schoolRespository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
