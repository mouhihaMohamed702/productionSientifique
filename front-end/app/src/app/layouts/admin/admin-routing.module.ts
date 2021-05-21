import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuteurComponent } from 'src/app/auteur/auteur.component';
import { AuteureditComponent } from 'src/app/auteuredit/auteuredit.component';
import { AuteurlistComponent } from 'src/app/auteurlist/auteurlist.component';
import { DoctorantComponent } from 'src/app/doctorant/doctorant.component';
import { DoctoranteditComponent } from 'src/app/doctorantedit/doctorantedit.component';
import { DoctorantlistComponent } from 'src/app/doctorantlist/doctorantlist.component';
import { EquipeComponent } from 'src/app/equipe/equipe.component';
import { EquipeeditComponent } from 'src/app/equipeedit/equipeedit.component';
import { EquipelistComponent } from 'src/app/equipelist/equipelist.component';
import { EtablissementComponent } from 'src/app/etablissement/etablissement.component';
import { EtablissementeditComponent } from 'src/app/etablissementedit/etablissementedit.component';
import { EtablissementlistComponent } from 'src/app/etablissementlist/etablissementlist.component';
import { HomeComponent } from 'src/app/home/home.component';
import { LoginComponent } from 'src/app/login/login.component';
import { ProfComponent } from 'src/app/prof/prof.component';
import { ProfeditComponent } from 'src/app/profedit/profedit.component';
import { ProflistComponent } from 'src/app/proflist/proflist.component';
import { PublicationComponent } from 'src/app/publication/publication.component';
import { SigComponent } from 'src/app/sig/sig.component';
//import { AboutComponent } from 'src/app/pages/about/about.component';
//import { ContactComponent } from 'src/app/pages/contact/contact.component';
//import { PortfolioComponent } from 'src/app/pages/portfolio/portfolio.component';

const routes: Routes = [
  { path: 'home',      component: HomeComponent },
  { path: 'publication',      component: PublicationComponent },
  { path: 'prof',      component: ProfComponent },
  { path: 'proflist',      component: ProflistComponent},
  { path: 'profedit',      component: ProfeditComponent},
  { path: 'doctorant',      component: DoctorantComponent },
  { path: 'doctorantlist',      component: DoctorantlistComponent },
  { path: 'doctorantedit',      component: DoctoranteditComponent },
  { path: 'equipe',      component: EquipeComponent },
  { path: 'equipelist',      component: EquipelistComponent },
  { path: 'equipeedit',      component: EquipeeditComponent },
  { path: 'etablissement',      component: EtablissementComponent },
  { path: 'etablissementlist',      component: EtablissementlistComponent },
  { path: 'etablissementedit',      component: EtablissementeditComponent },
  { path: 'auteur',      component: AuteurComponent },
  { path: 'auteurlist',      component: AuteurlistComponent },
  { path: 'auteuredit',      component: AuteureditComponent },
  { path: 'sigin',   component: SigComponent},
  { path: 'login',   component: LoginComponent },
  //{ path: 'contact',   component: ContactComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
