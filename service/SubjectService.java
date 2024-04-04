package com.learning_navigator.Learning.Navigator.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning_navigator.Learning.Navigator.entity.Students;
import com.learning_navigator.Learning.Navigator.entity.Subjects;
import com.learning_navigator.Learning.Navigator.repository.StudentRepository;
import com.learning_navigator.Learning.Navigator.repository.SubjectRepository;

public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;
    private StudentRepository studentRepository;

    public List<Subjects> getAllStudents(){
        return subjectRepository.findAll();
    }

    public Students enrollSubject(Long subjectId,Long studentId){
        if(studentId!=null){
            Optional<Students> studentoOptional = studentRepository.findByStudentId(studentId);
            Set<Subjects> subjects = studentoOptional.get().getEnrolledSubjects();
            subjects.geten
        }
        else{
            throw new StudentNotFound("Student not found in record: "+ studentId);
        }
    }
}
