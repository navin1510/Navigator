package com.learning_navigator.Learning.Navigator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning_navigator.Learning.Navigator.entity.Exams;
import com.learning_navigator.Learning.Navigator.entity.Students;
import com.learning_navigator.Learning.Navigator.service.ExamService;

import net.bytebuddy.utility.privilege.GetMethodAction;

@RestController
public class ExamController {
    static final String REST_API_ENDPOINT="/exam";

    @Autowired
    private ExamService examService;

    @PostMapping("/create")
    public ResponseEntity<Exams> createExam(@RequestBody Exams exam) {
        Exams createdExam = examService.createExam(exam);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdExam);
    }

}
