package com.sgic.demo.controller;

import com.sgic.demo.dto.SchoolDto;
import com.sgic.demo.service.SchoolService;
import com.sgic.demo.utils.EndPointBundle;
import com.sgic.demo.utils.ResponseWrapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(EndPointBundle.SCHOOL)
public class SchoolController {

    @Autowired
    private   SchoolService schoolService;


    @PostMapping
    public ResponseEntity<ResponseWrapper<SchoolDto>> createSchool(@Valid @RequestBody SchoolDto schoolDto) {
        SchoolDto createdSchool = schoolService.createSchool(schoolDto);

        if (createdSchool != null) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseWrapper<>(
                            HttpStatus.CREATED.value(),
                            "created successfully",
                            createdSchool));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseWrapper<>(
                            HttpStatus.BAD_REQUEST.value(),
                            "Failed to create school",
                            null));
        }
    }


    @GetMapping
    public ResponseEntity<ResponseWrapper<List<SchoolDto>>> getAllSchools() {
        List<SchoolDto> schools = schoolService.getAllSchools();

        return ResponseEntity.ok(new ResponseWrapper<>(
                HttpStatus.OK.value(),
                "Successfully fetched all schools",
                schools
        ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper<SchoolDto>> getSchoolById(@PathVariable Long id) {
        SchoolDto school = schoolService.getSchoolById(id);

        if (school != null) {
            return ResponseEntity.ok(new ResponseWrapper<>(
                    HttpStatus.OK.value(),
                    " found successfully",
                    school
            ));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseWrapper<>(
                            HttpStatus.NOT_FOUND.value(),
                            "School not found with ID: " + id,
                            null));
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<ResponseWrapper<SchoolDto>> updateSchool(
            @PathVariable Long id,
            @Valid @RequestBody SchoolDto schoolDto) {

        SchoolDto updatedSchool = schoolService.updateSchool(id, schoolDto);

        if (updatedSchool != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseWrapper<>(
                            HttpStatus.OK.value(),
                            "School updated successfully",
                            updatedSchool));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseWrapper<>(
                            HttpStatus.NOT_FOUND.value(),
                            "School not found with ID: " + id,
                            null));
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseWrapper<String>> deleteSchool(@PathVariable Long id) {
        boolean deleted = schoolService.deleteSchool(id);

        if (deleted) {
            return ResponseEntity.ok(new ResponseWrapper<>(
                    HttpStatus.OK.value(),
                    "School deleted successfully",
                    "Deleted school with ID: " + id
            ));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseWrapper<>(
                            HttpStatus.NOT_FOUND.value(),
                            "School not found with ID: " + id,
                            null));
        }

        //spaces..
    }
}
