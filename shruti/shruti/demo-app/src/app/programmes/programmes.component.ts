import { Component } from '@angular/core';

@Component({
  selector: 'app-programmes',
  templateUrl: './programmes.component.html',
  styleUrls: ['./programmes.component.css']
})
export class ProgrammesComponent {
  fontColor='blue';
  sayHelloId=1;
  disa='None'
  canClick="/welcome"
  changeMyColor(){
    if(this.fontColor==="red"){
      this.fontColor='blue';    
    }
    else{
      this.fontColor='red';
    }
    this.disa='disabled';
  }

  popupbox(){
    alert("Welcome to SOmaiya");
  }
}

