package com.mohamed.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Etablissement {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name="nom")
    private String nom;

    public Etablissement(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Etablissement(){}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
