package com.learning_navigator.Learning.Navigator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning_navigator.Learning.Navigator.Exceptionhandler.StudentNotFoundException;
import com.learning_navigator.Learning.Navigator.entity.Students;
import com.learning_navigator.Learning.Navigator.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Students> getAllStudents(){
        return studentRepository.findAll();
    }

    public Students getSpecicStudents(String studentId){
        Optional<Students> studentoOptional= studentRepository.findByStudentId(studentId);
        return studentoOptional.orElseThrow(()->new StudentNotFoundException("Student not found in record: "+ studentId));
    }

    public Students addStudent(Students students){
        return studentRepository.save(students);
    }

    public void deleteStudents(String studentId){
        if(studentId!=null)
            studentRepository.deleteById(studentId);
        else
            throw new StudentNotFound("Student not found in record: "+ studentId)
    }
}
