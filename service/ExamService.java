package com.learning_navigator.Learning.Navigator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning_navigator.Learning.Navigator.entity.Exams;
import com.learning_navigator.Learning.Navigator.repository.ExamRepository;

public class ExamService {
    @Autowired
    private ExamRepository examRepository;

    public List<Exams> getAllStudents(){
        return examRepository.findAll();
    }
}
