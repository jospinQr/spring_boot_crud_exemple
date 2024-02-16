package com.megamind.YanguHospital.medecin;

import jakarta.persistence.*;

@Entity
@Table
public class Medecin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String  email;
    private String  specialisation;

    public Medecin() {
    }

    public Medecin(String nom, String email, String specialisation) {
        this.nom = nom;
        this.email = email;
        this.specialisation = specialisation;
    }

    public Medecin(Long id, String nom, String email, String specialisation) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.specialisation = specialisation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }


    @Override
    public String toString() {
        return "Medecin{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", specialisation='" + specialisation + '\'' +
                '}';
    }
}
