import { Component } from '@angular/core';
import { CommonServiceService } from '../services/common-service.service';

@Component({
  selector: 'app-learning',
  templateUrl: './learning.component.html',
  styleUrls: ['./learning.component.css']
})
export class LearningComponent {

  constructor(private service:CommonServiceService){}
  message:string="";
  getMessage()
  {
    
    this.service.getMessage().subscribe(
      response => this.message = response.toString()
    );
  }

}


