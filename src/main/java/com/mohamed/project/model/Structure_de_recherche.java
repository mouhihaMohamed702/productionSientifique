package com.mohamed.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Structure_de_recherche {
    //    nom ,acronyme, responsable (prof) ,etablissement . type (labo,...),membre,doctoronts,
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name="nom")
    private String nom;

    public Structure_de_recherche(Integer id, String nom, String acronym, String responsable_id, String etab_id, String type) {
        this.id = id;
        this.nom = nom;
        this.acronym = acronym;
        this.responsable_id = responsable_id;
        this.etab_id = etab_id;
        this.type = type;
    }

    public Structure_de_recherche(){}

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

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getResponsable_id() {
        return responsable_id;
    }

    public void setResponsable_id(String responsable_id) {
        this.responsable_id = responsable_id;
    }

    public String getEtab_id() {
        return etab_id;
    }

    public void setEtab_id(String etab_id) {
        this.etab_id = etab_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name="acronym")
    private String acronym;
    @Column(name="responsable_id")
    private String responsable_id;//Prof
    @Column(name="etab_id")
    private String etab_id;
    @Column(name="type")
    private String type;
}
