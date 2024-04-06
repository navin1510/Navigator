package com.learning_navigator.Learning.Navigator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning_navigator.Learning.Navigator.Exceptionhandler.ExamNotFoundException;
import com.learning_navigator.Learning.Navigator.Exceptionhandler.StudentNotFoundException;
import com.learning_navigator.Learning.Navigator.Exceptionhandler.SubjectNotFoundException;
import com.learning_navigator.Learning.Navigator.entity.Exams;
import com.learning_navigator.Learning.Navigator.entity.Students;
import com.learning_navigator.Learning.Navigator.entity.Subjects;
import com.learning_navigator.Learning.Navigator.repository.ExamRepository;
import com.learning_navigator.Learning.Navigator.repository.StudentRepository;
import com.learning_navigator.Learning.Navigator.repository.SubjectRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private ExamRepository examRepository;

    
    public List<Students> getAllStudents(){
        return studentRepository.findAll();
    }

    public Students getSpecicStudents(Long studentId){
        Optional<Students> studentoOptional= studentRepository.findByStudentId(studentId);
        return studentoOptional.orElseThrow(()->new StudentNotFoundException("Student not found in record: "+ studentId));
    }

    public Students addStudent(Students students){
        return studentRepository.save(students);
    }

    public void deleteStudents(Long studentId){
        if(studentId!=null)
            studentRepository.deleteByStudentId(null);
        else
            throw new StudentNotFoundException("Student not found in record: "+ studentId);
    }

    public Students enrollSubject(Long studentId, Long subjectId) {
        Students student = studentRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotFoundException("Student not found"));

        Subjects subject = subjectRepository.findById(subjectId)
                .orElseThrow(() -> new SubjectNotFoundException("Subject not found"));

        student.getEnrolledSubjects().add(subject);
        subject.getRegisteredStudents().add(student);

        studentRepository.save(student);
        subjectRepository.save(subject);

        return student;
    }

    public Students enrollExam(Long studentId, Long examId) {
        Students student = studentRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotFoundException("Student not found"));

        Exams exam = examRepository.findById(examId)
                .orElseThrow(() -> new ExamNotFoundException("Exam not found"));

        if (!student.getEnrolledSubjects().contains(exam.getSubject())) {
            throw new SubjectNotFoundException("Student is not enrolled in the corresponding subject");
        }

        student.getRegisteredExams().add(exam);
        exam.getEnrolledStudents().add(student);

        studentRepository.save(student);
        examRepository.save(exam);

        return student;
    }
}
