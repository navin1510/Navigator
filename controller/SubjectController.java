package com.learning_navigator.Learning.Navigator.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.learning_navigator.Learning.Navigator.entity.Students;
import com.learning_navigator.Learning.Navigator.entity.Subjects;

@RestController
public class SubjectController {
    static final String REST_API_ENTPOINT = "/subject";

    @Autowired
    SubjectService subjectService;

    @GetMapping(REST_API_ENTPOINT)
    public List<Subjects> getAllSubject(){
        
    }

    @PutMapping(REST_API_ENTPOINT + "/{subjectId}/enroll")
    public Students enrollSubject(@PathVariable(name="subjectId") String subjectId,@RequestBody String studentId ){
        
    }

}
