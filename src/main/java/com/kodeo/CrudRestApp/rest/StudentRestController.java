package com.kodeo.CrudRestApp.rest;

import com.kodeo.CrudRestApp.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    // define variables
    private List<Student> theStudents;

    // load data only once
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Nima", "Patel"));
        theStudents.add(new Student("avi", "sen"));
        theStudents.add(new Student("katy", "oma"));
    }
    // define endpoint for retrieving all objects
    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    // define endpoint for retrieving specific object
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return theStudents.get(studentId);
    }
    
}
