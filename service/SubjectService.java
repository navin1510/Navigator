package com.learning_navigator.Learning.Navigator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning_navigator.Learning.Navigator.entity.Subjects;
import com.learning_navigator.Learning.Navigator.repository.SubjectRepository;

public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subjects> getAllStudents(){
        return subjectRepository.findAll();
    }

    public Subjects createSubject(Subjects subject) {
        return subjectRepository.save(subject);
    }
}
