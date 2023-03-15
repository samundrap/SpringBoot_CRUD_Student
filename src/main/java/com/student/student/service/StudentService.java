package com.student.student.service;

import com.student.student.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student getStudentById(Long studentId);
    public Student AddStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(Long studentId);
}
