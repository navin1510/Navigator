package com.learning_navigator.Learning.Navigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning_navigator.Learning.Navigator.entity.Exams;

@Repository
public interface ExamRepository extends JpaRepository<Exams,Long> {
    
}
