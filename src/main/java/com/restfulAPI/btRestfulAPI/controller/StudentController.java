package com.restfulAPI.btRestfulAPI.controller;

import com.restfulAPI.btRestfulAPI.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private List<Student> list = new ArrayList<>();
    @Autowired
    Student student;
    @GetMapping("")
    public ResponseEntity<?> addRequestParam(@RequestParam("name") String name, @RequestParam("age") int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        list.add(student);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/{name}/{age}")
    public ResponseEntity<?> addPathVariable(@PathVariable("name") String name, @PathVariable("age") int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        list.add(student);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/requestbody")
    public ResponseEntity<?> requestBody(@RequestBody Student student){
        list.add(student);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
