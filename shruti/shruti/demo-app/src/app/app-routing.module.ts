import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExamComponent } from './exam/exam.component';
import { HeaderComponent } from './header/header.component';
import { ProgrammesComponent } from './programmes/programmes.component';
import { StudyComponent } from './study/study.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { AdmissionsComponent } from './admissions/admissions.component';

const routes: Routes = [
  {path:"", redirectTo:'welcome',pathMatch:'full'},
  {path:"welcome",component:WelcomeComponent},
  {path:"exam", redirectTo:'exam',pathMatch:'full'},
  {path:"exam",component:ExamComponent},
  {path:"programmes", redirectTo:'programmes',pathMatch:'full'},
  {path:"programmes",component:ProgrammesComponent},
  {path:"study", redirectTo:'study',pathMatch:'full'},
  {path:"study",component:StudyComponent},
  {path:"welcome", redirectTo:'welcome',pathMatch:'full'},
  {path:"welcome",component:WelcomeComponent},
  {path:"about-us", redirectTo:'about-us',pathMatch:'full'},
  {path:"about-us",component:AboutUsComponent},
  {path:"admissions", redirectTo:'admissions',pathMatch:'full'},
  {path:"admissions",component:AdmissionsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
