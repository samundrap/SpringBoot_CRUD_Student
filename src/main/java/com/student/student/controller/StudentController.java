package com.student.student.controller;

import com.student.student.model.Student;
import com.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(path = "/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.AddStudent(student), HttpStatus.CREATED);
    }


    @PutMapping(path = "/student")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/student/{studentId}")
    public ResponseEntity<String> deleteStudent(@PathVariable(value = "studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>("Student with Student Id: " + studentId + " deleted Successfully.", HttpStatus.OK);
    }

    @GetMapping(path = "/student/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable(value = "studentId") Long studentId) {
        return new ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
    }

    @GetMapping(path = "/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
