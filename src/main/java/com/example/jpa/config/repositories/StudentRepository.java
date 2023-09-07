package com.example.jpa.config.repositories;

import com.example.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student>findAllByName(String name);
}



