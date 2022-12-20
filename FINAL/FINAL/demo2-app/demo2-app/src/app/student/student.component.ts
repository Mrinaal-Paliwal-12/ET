import { Component } from '@angular/core';
import { CommonServiceService } from '../services/common-service.service';
import { Student } from '../student';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {
studentsData:Student[]=[];
mydata:Student=new Student(0,"","");

Rollno:number=0;
StudentName:string="";
Courses:string=""
errorMsg :string="";
updatedData:string="";
message:string="";

constructor(private service:CommonServiceService){}
getStudentData(){
  console.log("inside student data");
  this.service.getStudentData().subscribe(
    response => this.handleStudentData(response)
  )
}

handleStudentData(response:Student[]){
  console.log(response);
  this.studentsData = response;
}

list1(){
  console.log("inside student data list1");
  console.log(this.Rollno)
  this.service.list1(this.Rollno).subscribe(
    response => this.handlelist1(response),
    error => this.handleError(error)
  )
}

handlelist1(response:Student){
  console.log(response);
  if(response == null){
    this.errorMsg="no records found";
  }else{ 
  this.mydata = response;
  this.StudentName=this.mydata.studentName
  this.Courses = this.mydata.courses
  
}
}

handleError(error:Student){
  if(error==null){

}
}

updateStudentData(){
  console.log(this.Rollno,this.StudentName,this.Courses);
  this.service.updateStudentData(new Student(this.Rollno,this.StudentName,this.Courses)).subscribe(
    response=>this.handleUpdatedData(response)
  );
  
}
handleUpdatedData(response:Student){
  if(response == null)
  {
    this.errorMsg="Student Data Update failed..!"
    this.message="";
  }
  else{
    this.message="Student Data Updated Successfully";
    this.errorMsg="";
  }
  this.getStudentData();
}
}
