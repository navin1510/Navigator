package com.learning_navigator.Learning.Navigator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning_navigator.Learning.Navigator.entity.Subjects;
import com.learning_navigator.Learning.Navigator.service.SubjectService;

@RestController
public class SubjectController {
    static final String REST_API_ENTPOINT = "/subject";

    @Autowired
    private SubjectService subjectService;

    @PostMapping(REST_API_ENTPOINT+"/create")
    public ResponseEntity<Subjects> createSubject(@RequestBody Subjects subject) {
        Subjects createdSubject = subjectService.createSubject(subject);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSubject);
    }


}
