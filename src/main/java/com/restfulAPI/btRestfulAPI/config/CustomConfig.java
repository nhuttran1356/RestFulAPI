package com.restfulAPI.btRestfulAPI.config;

import com.restfulAPI.btRestfulAPI.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {
    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("Nguyen Van A");
        student.setAge(22);
        return student;
    }
}
