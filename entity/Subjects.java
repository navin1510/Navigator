package com.learning_navigator.Learning.Navigator.entity;

import java.util.List;

import org.hibernate.annotations.Collate;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String subjectId;
    private String name;

    @ManyToMany(mappedBy = "enrolledSubjects")
    private List<Students> registeredStudents;
}
