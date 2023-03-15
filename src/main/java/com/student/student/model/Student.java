package com.student.student.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Student")
public class Student {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long id;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Code")
    private String studentCode;
    @Column(name = "Designation")
    private String designation;

}
