/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demoangular;

/**
 *
 * @author studentadmin
 */
class Student {
    
    Student(int Rollno,String StudentName,String Courses){
        this.Rollno = Rollno;
        this.StudentName = StudentName;
        this.Courses = Courses;
    }
    private int Rollno;
    private String StudentName;
    private String Courses;

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int Rollno) {
        this.Rollno = Rollno;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getCourses() {
        return Courses;
    }

    public void setCourses(String Courses) {
        this.Courses = Courses;
    }
    
    
}
