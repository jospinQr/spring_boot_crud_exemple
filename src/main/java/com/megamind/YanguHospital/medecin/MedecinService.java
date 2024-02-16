package com.megamind.YanguHospital.medecin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinService {

    private final MedecinRepository repository;

    @Autowired
    public MedecinService(MedecinRepository repository) {
        this.repository = repository;
    }


    public List<Medecin> getAllMedecin(){
        return repository.findAll();
    }

    public void postMedecin(Medecin medecin) {
          repository.save(medecin);
    }
}
