package com.example.jpa.config;

import com.example.jpa.config.repositories.StudentRepository;
import com.example.jpa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
@Component
public class InitData implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("Bruce");
        s1.setBorndate(LocalDate.of(2010,11,12));
        s1.setBornTime(LocalTime.of(10,11,12));

        studentRepository.save(s1);
        studentRepository.save(s1);
        studentRepository.save(s1);
        s1.setName("Tim");
        studentRepository.save(s1);

        s2.setName("Tobias");
        s2.setBorndate(LocalDate.of(2000,9,5));
        s2.setBornTime(LocalTime.of(2,1,14));
        studentRepository.save(s2);
        studentRepository.save(s2);
        studentRepository.save(s2);
    }
}
