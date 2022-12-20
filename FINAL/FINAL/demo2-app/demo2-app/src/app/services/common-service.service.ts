import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import { Student } from '../student';


@Injectable({
  providedIn: 'root'
})
export class CommonServiceService {

  constructor(private http: HttpClient){}

  getMessage(){
    return this.http.get("http://localhost:8080/Message",{responseType: 'text'});
  }

  getStudentData()
  {
    return this.http.get<Student[]>("http://localhost:8080/Student");
  }

  list1(roll:number){
    return this.http.get<Student>("http://localhost:8080/Student/"+roll);
  }

  updateStudentData(student:Student)
  {
    let url:string="http://localhost:8080/update/";
    return this.http.post<Student>(url,student);
  }
}

