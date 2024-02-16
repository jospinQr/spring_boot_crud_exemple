package com.megamind.YanguHospital.patient;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;


@Entity
@Table
public class Patient {


    @Id
    @SequenceGenerator(

            name = "patient_sequence",
            sequenceName = "patient_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_sequence"
    )
    private Long id;
    private String nom;
    private Integer age;
    private LocalDate dateAniv;

    private String email;

    public Patient() {
    }


    public Patient(Long id, String nom, Integer age, LocalDate dateAniv, String email) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.dateAniv = dateAniv;
        this.email = email;
    }

    public Patient(String nom, Integer age, LocalDate dateAniv, String email) {
        this.nom = nom;
        this.age = age;
        this.dateAniv = dateAniv;
        this.email = email;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateAniv() {
        return dateAniv;
    }

    public void setDateAniv(LocalDate dateAniv) {
        this.dateAniv = dateAniv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", dateAniv=" + dateAniv +
                ", email='" + email + '\'' +
                '}';
    }






}
