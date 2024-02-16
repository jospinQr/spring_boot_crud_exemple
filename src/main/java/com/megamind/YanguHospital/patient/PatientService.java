package com.megamind.YanguHospital.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {


    private final PatientRepository repository;


    @Autowired
    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getPatients() {
        return repository.findAll();

    }

    public Patient getPatientById(Long id) {

        Optional<Patient> pationById = repository.findById(id);
        return pationById.orElse(null);
    }

    public void addNewPatient(Patient patient) {

        Optional<Patient> patient1 =
                repository.getPatientByEmail(patient.getEmail());

        if (patient1.isPresent()) {

            throw new IllegalStateException("Le patient avec cet email existe");
        }

        repository.save(patient);
    }

    public void  deletePatient(Long id){

        repository.deleteById(id);
    }
}
