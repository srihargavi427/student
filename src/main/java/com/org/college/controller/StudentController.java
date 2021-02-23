package com.org.college.controller;

import com.org.college.entity.StudentEntity;
import com.org.college.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studententity")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @PostMapping("/create")
    public void create(@RequestBody StudentEntity entity){
        studentRepository.save(entity);
    }
}
