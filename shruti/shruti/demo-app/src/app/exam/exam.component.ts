import { Component } from '@angular/core';
import { Exam } from '../exam';

@Component({
  selector: 'app-exam',
  templateUrl: './exam.component.html',
  styleUrls: ['./exam.component.css']
})
export class ExamComponent {
  
  EXAM:Exam[]=[
    {date:"2022-12-21",subject:'ET',course:'MCA',timing:'2:30 pm to 5:30 pm'},
    {date:"2022-12-22",subject:'Database',course:'MCA',timing:'2:30 pm to 5:30 pm'},
    {date:"2022-12-23",subject:'SpringBoot',course:'MCA',timing:'2:30 pm to 5:30 pm'},
    {date:"2022-12-24",subject:'Java',course:'MCA',timing:'2:30 pm to 5:30 pm'},
    {date:"2022-12-25",subject:'DMIS',course:'MCA',timing:'2:30 pm to 5:30 pm'}
  ];
}
