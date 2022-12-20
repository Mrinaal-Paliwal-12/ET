import { Component } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-about-us',
  templateUrl: './about-us.component.html',
  styleUrls: ['./about-us.component.css']
})
export class AboutUsComponent {
  STUDENTS:Student[]=[
    {id:1,name:'Shruti',course:'MCA',email:'shruti@somaiya.edu'},
    {id:2,name:'sarvesh',course:'MBA',email:'sarvesh@somaiya.edu'},
    {id:3,name:'shweta',course:'MSC',email:'shweta@somaiya.edu'},
    {id:4,name:'sudhir',course:'MCA',email:'sudhir@somaiya.edu'},
    {id:5,name:'shashi',course:'BA',email:'shashi@somaiya.edu'}

  ];
}
