/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.example.demoangular;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author studentadmin
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class myController {
     private static List<Student> studentList = new ArrayList<>();
        static{
            studentList.add(new Student(1,"Saayli","MCA"));
            studentList.add(new Student(2,"Swapnil","BscIT"));
            studentList.add(new Student(3,"Amey","MCA"));
        }
    @GetMapping(path="/Message")
        public String getMessage(){
            return "Welcome to the Angular Playground";
        }
        
    @GetMapping(path="/Student")
        public List<Student> getStudentData(){
            return studentList;
        }
        
    @GetMapping("/Student/{Rollno}")
        public Student list1(@PathVariable int Rollno){
            for(Student student:studentList)
            {
                if(student.getRollno() == Rollno)
                {
                    return student;
                }
            }
            return null;
        }
        
    @PostMapping(path="/update")
        public Student update(@RequestBody Student stud)
        {
            for(Student student:studentList){
            if(student.getRollno() == stud.getRollno()){
                studentList.remove(student);
                studentList.add(stud);
                return stud;
            }
            }
            return null;
        }
    
    
}
