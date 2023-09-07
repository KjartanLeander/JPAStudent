package com.example.jpa.config.repositories;

import com.example.jpa.model.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import org.junit.Assert;


import static org.junit.Assert.assertEquals;
@DataJpaTest


class StudentRepositoryTest {
@Autowired StudentRepository studentRepository;
@Test
    void testOneTim(){
    List<Student>lst=studentRepository.findAllByName("Tim");
    assertEquals(1,lst.size());
    }

    @Test
    void testOneViggo(){
        Student s1 = new Student();
        s1.setName("Viggo");
        s1.setBorndate(LocalDate.of(2010,11,12));
        studentRepository.save(s1);
        List<Student> lst = studentRepository.findAllByName("Viggo");
        assertEquals(1,lst.size());
}
}