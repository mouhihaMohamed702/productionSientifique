import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

import { NavbarComponent } from './navbar/navbar.component';

import { FooterComponent } from './footer/footer.component';

import { AdminComponent } from './layouts/admin/admin.component';
import { SigComponent } from './sig/sig.component';
import { LoginComponent } from './login/login.component';
import { PublicationComponent } from './publication/publication.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
   
    NavbarComponent,
  
    FooterComponent,
   
    AdminComponent,
   
    SigComponent,
   
    LoginComponent,
   
    PublicationComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
