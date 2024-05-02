package com.sip.ams.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(length = 64, nullable = false)
    private String nom;
     
    private Integer age;
     
    public Etudiant(String nom, Integer age) {
        this.nom = nom;
        this.age = age;
    }
 
    public Etudiant() {
    }
 
    // Les getters et setters sont nécessaires pour accéder aux champs privés

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Etudiant [id=" + id + ", nom=" + nom + ", age=" + age + "]";
    }
}
