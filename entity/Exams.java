package com.learning_navigator.Learning.Navigator.entity;

import java.util.List;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Exams")
public class Exams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String examId;
    @ManyToOne
    private Subjects subject;
    @ManyToMany
    @JoinTable(
        name = "exam_student";
        JoinColumn= @JoinColumn(name = "exam_id"),
        inverseJoinColumns= @JoinColumn(name = "student_id");
    )
    private List<Students> enrolledStudents;
}
