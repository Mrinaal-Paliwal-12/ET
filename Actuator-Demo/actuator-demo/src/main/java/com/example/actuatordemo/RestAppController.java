package com.example.actuatordemo;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAppController {

    @Autowired
    StudentService service;

    @GetMapping("/test")
    public String getApp() {
        return "working";
    }

    @GetMapping("/findStudent/{id}")
    public Student findStudentById(@PathVariable("id") String id) {

        return service.getStudent(id);
    }

    @GetMapping("/fact/{id}")
    public int factorial(@PathVariable("id") int id) {
        
        return service.getfactorial(id);
    }

    
    @GetMapping("/remove")
    public String removeStud() {
        service.removeValues();
        return "cached value cleared";
    }
}
