package com.learning_navigator.Learning.Navigator.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning_navigator.Learning.Navigator.entity.Students;
import com.learning_navigator.Learning.Navigator.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentsService;
    
    static final String  REST_API_ENDPOINT = "/students";

    @GetMapping(REST_API_ENDPOINT)
    public List<Students> getAllStudents(){

    }

    @GetMapping("/students/{studentsId}")
    public Students getSpecificstudents(@PathVariable(name="studentsId") String studentsId) {
        return studentsService.getSpecificstudents(studentsId);
    }

    // POST /studentss - Register a new students to the contest
    @PostMapping(REST_API_ENDPOINT)
    public Students addstudents(@RequestBody Students students){
        return studentsService.addstudents(students);  
    }

    // PUT /studentss/{studentsId} - Update the score of a specific students
    @PutMapping("/students/{studentsId}")
    public Students UpdatestudentsScore(@PathVariable(name="studentsId") String studentsId,@RequestBody Map<String,Integer> scoremap){
        int score = scoremap.get("score");
        return studentsService.updatestudentsScore(studentsId,score);   
    }

    // DELETE /studentss/{studentsId} - Deregister a specific students from the contest
    @DeleteMapping("/students/{studentsId}")
    public void deletestudents(@PathVariable(name="studentsId") String studentsId){
        studentsService.deletestudents(studentsId);  
    



}
