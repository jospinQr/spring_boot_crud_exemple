package com.megamind.YanguHospital.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/patient")
public class PatientController {


    private final PatientService patientService;


    @Autowired
    public PatientController(PatientService patientService) {

        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getPatient() {
        return patientService.getPatients();
    }

    @GetMapping( "/{id}")
    public Patient getPatientbyId(@PathVariable("id") Long id){
        return patientService.getPatientById(id);
    }

    @PostMapping
    public  void  registerStudent(@RequestBody Patient patient){
        patientService.addNewPatient(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable("id") Long id){

        patientService.deletePatient(id);
    }

}
