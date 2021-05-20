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
import { EtablissementComponent } from './etablissement/etablissement.component';
import { AuteurComponent } from './auteur/auteur.component';
import { DoctorantComponent } from './doctorant/doctorant.component';
import { EquipeComponent } from './equipe/equipe.component';
import { ProfComponent } from './prof/prof.component';
import { Etab2Component } from './etab2/etab2.component';
import { ProflistComponent } from './proflist/proflist.component';
import { DoctorantlistComponent } from './doctorantlist/doctorantlist.component';
import { EquipelistComponent } from './equipelist/equipelist.component';
import { AuteurlistComponent } from './auteurlist/auteurlist.component';
import { EtablissementlistComponent } from './etablissementlist/etablissementlist.component';
import { EtablissementeditComponent } from './etablissementedit/etablissementedit.component';
import { EquipeeditComponent } from './equipeedit/equipeedit.component';
import { ProfeditComponent } from './profedit/profedit.component';
import { DoctoranteditComponent } from './doctorantedit/doctorantedit.component';
import { AuteureditComponent } from './auteuredit/auteuredit.component';
import { PublicationeditComponent } from './publicationedit/publicationedit.component';


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
   
    EtablissementComponent,
   
    AuteurComponent,
   
    DoctorantComponent,
   
    EquipeComponent,
   
    ProfComponent,
   
    Etab2Component,
   
    ProflistComponent,
   
    DoctorantlistComponent,
   
    EquipelistComponent,
   
    AuteurlistComponent,
   
    EtablissementlistComponent,
   
    EtablissementeditComponent,
   
    EquipeeditComponent,
   
    ProfeditComponent,
   
    DoctoranteditComponent,
   
    AuteureditComponent,
   
    PublicationeditComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
