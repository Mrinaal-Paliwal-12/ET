import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LearningComponent } from './learning/learning.component';
import { StudentComponent } from './student/student.component';

const routes: Routes = [ {path:"",redirectTo:'welcome',pathMatch:'full'},
{path:"learning",component:LearningComponent},
{path:"student",component:StudentComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
