import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuteurComponent } from 'src/app/auteur/auteur.component';
import { DoctorantComponent } from 'src/app/doctorant/doctorant.component';
import { EquipeComponent } from 'src/app/equipe/equipe.component';
import { EtablissementComponent } from 'src/app/etablissement/etablissement.component';
import { HomeComponent } from 'src/app/home/home.component';
import { LoginComponent } from 'src/app/login/login.component';
import { ProfComponent } from 'src/app/prof/prof.component';
import { PublicationComponent } from 'src/app/publication/publication.component';
import { SigComponent } from 'src/app/sig/sig.component';
//import { AboutComponent } from 'src/app/pages/about/about.component';
//import { ContactComponent } from 'src/app/pages/contact/contact.component';
//import { PortfolioComponent } from 'src/app/pages/portfolio/portfolio.component';

const routes: Routes = [
  { path: 'home',      component: HomeComponent },
  { path: 'publication',      component: PublicationComponent },
  { path: 'prof',      component: ProfComponent },
  { path: 'doctorant',      component: DoctorantComponent },
  { path: 'equipe',      component: EquipeComponent },
  { path: 'etablissement',      component: EtablissementComponent },
  { path: 'auteur',      component: AuteurComponent },
  { path: 'sigin',   component: SigComponent},
  { path: 'login',   component: LoginComponent },
  //{ path: 'contact',   component: ContactComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
