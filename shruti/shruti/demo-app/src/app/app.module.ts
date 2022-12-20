import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { StudyComponent } from './study/study.component';
import { ExamComponent } from './exam/exam.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ProgrammesComponent } from './programmes/programmes.component';
import { AdmissionsComponent } from './admissions/admissions.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    StudyComponent,
    ExamComponent,
    HeaderComponent,
    FooterComponent,
    AboutUsComponent,
    ProgrammesComponent,
    AdmissionsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
