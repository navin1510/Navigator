package com.learning_navigator.Learning.Navigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning_navigator.Learning.Navigator.entity.Subjects;

@Repository
public interface SubjectRepository extends JpaRepository<Subjects,Long>{
    
}
