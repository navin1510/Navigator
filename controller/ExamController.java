package com.learning_navigator.Learning.Navigator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning_navigator.Learning.Navigator.entity.Exams;
import com.learning_navigator.Learning.Navigator.entity.Students;

import net.bytebuddy.utility.privilege.GetMethodAction;

@RestController
public class ExamController {
    static final String REST_API_ENDPOINT="/exam";

    @Autowired
    ExamService examservice;

    @GetMapping(REST_API_ENDPOINT)
    public List<Exams> getAllExams(){
        
    }

    @PutMapping(REST_API_ENDPOINT + "/{examId}/enroll")
    public Students enrollSubject(@PathVariable(name="examId") String examId,@RequestBody String studentId ){
        
    }
}
