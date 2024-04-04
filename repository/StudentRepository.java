package com.learning_navigator.Learning.Navigator.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning_navigator.Learning.Navigator.entity.Students;

@Repository


// @Query("SELECT u FROM User u WHERE u.userId = :userId")
// Optional<User> findByUserId(@Param("userId") String userId);
public interface StudentRepository extends JpaRepository<Students,Long>{
    @Query("SELECT u from Students u where u.studentId = :studentId")
    Optional<Students> findByStudentId(@Param("studentId") Long studentId);

    void deleteByStudentId(Long studentId);
}
