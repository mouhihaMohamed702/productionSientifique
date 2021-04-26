package com.mohamed.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipe {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "structur_id")
    private Integer id_structur;
    @Column(name = "nom")
    private Integer nom;
    @Column(name = "prenom")
    private Integer prenom;
    @Column(name = "type")
    private String type; // doctorant , prof ,..

    public Equipe(Integer id, Integer id_structur, Integer nom, Integer prenom, String type) {
        this.id = id;
        this.id_structur = id_structur;
        this.nom = nom;
        this.prenom = prenom;
        this.type = type;
    }
    public Equipe(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_structur() {
        return id_structur;
    }

    public void setId_structur(Integer id_structur) {
        this.id_structur = id_structur;
    }

    public Integer getNom() {
        return nom;
    }

    public void setNom(Integer nom) {
        this.nom = nom;
    }

    public Integer getPrenom() {
        return prenom;
    }

    public void setPrenom(Integer prenom) {
        this.prenom = prenom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
