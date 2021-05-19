package com.mohamed.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Publicaton {
    //  titre, auteurs (prof ,doctorant, intern ou externe order Important),annee du pub
    //     pub revue internationnale indexe : nom complet du jornal
    //    pub revue commite de leccture : nom complet du jornal
    //    pub revue sans cmmite de lecture : nom complet du jornal

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name="titre")
    private String titre;
    @Column(name = "annee")
    private String annee;
    @Column(name = "type_revu")
    private String type_revu;
    @Column (name = "jornal")
    private String jornal;


    public Publicaton(Integer id, String titre, String annee, String type_revu, String jornal) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.type_revu = type_revu;
        this.jornal = jornal;
    }

    public Publicaton(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getType_revu() {
        return type_revu;
    }

    public void setType_revu(String type_revu) {
        this.type_revu = type_revu;
    }

    public String getJornal() {
        return jornal;
    }

    public void setJornal(String jornal) {
        this.jornal = jornal;
    }
}
