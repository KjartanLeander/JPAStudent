package com.example.jpa.config.repositories;

import com.example.jpa.model.Student;
import com.example.jpa.config.repositories.StudentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    void setup() {
        Student std = new Student();
        std.setName("Tim");
        studentRepository.save(std);
    }

    @Test
    void testOneTim() {
        List<Student> lst = studentRepository.findAllByName("Tim");
        assertEquals(1, lst.size());
    }

    @Test
    void testOneViggo() {
        Student s1 = new Student();
        s1.setName("Viggo");
        s1.setBorndate(LocalDate.of(2010, 11, 12));
        studentRepository.save(s1);
        List<Student> lst = studentRepository.findAllByName("Viggo");
        assertEquals(1, lst.size());
    }
}
