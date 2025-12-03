package com.sgic.demo.repository;

import com.sgic.demo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRespository extends JpaRepository<School, Long > {
}
