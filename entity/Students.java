package com.learning_navigator.Learning.Navigator.entity;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(unique = true)
    private String registrationID;
    private String name;
    @ManyToMany
    @JoinTable(
        name = "student_subject",
        joinColumns = @JoinColumn(name="student_id"),
        inverseJoinColumns = @JoinColumn(name="subject_id")
    )
    private Set<Subjects> enrolledSubjects;
    @ManyToMany(mappedBy = "enrolledStudents")
    private Set<Exams> registeredExams;
}
