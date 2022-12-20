import { Component, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent  implements OnInit , OnDestroy{
  time = new Date();
  intervalId:string | number | NodeJS.Timer | undefined;
  ngOnDestroy(): void {
    throw new Error('Method not implemented.');
  }
  ngOnInit(): void {
    
    this.intervalId=setInterval(()=> {
      console.log(this.time);
      this.time = new Date();
    },1000);
  }
 

}
