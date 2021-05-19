package com.mohamed.project.model;

import javax.persistence.*;

@Entity
public class Auteurs {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "pub_id")
    private Integer pub_id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "type")
    private String type;
    public Auteurs(){

    }
    public Auteurs(Integer id, Integer pub_id, String nom, String prenom, String type) {
        this.id = id;
        this.pub_id = pub_id;
        this.nom = nom;
        this.prenom = prenom;
        this.type = type;
    }
    // intern,extern

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPub_id() {
        return pub_id;
    }

    public void setPub_id(Integer pub_id) {
        this.pub_id = pub_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
