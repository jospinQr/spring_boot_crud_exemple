package com.megamind.YanguHospital.medecin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/medecin")
public class MedecinController {

    private final MedecinService service;


    public MedecinController(MedecinService service) {
        this.service = service;
    }

    @GetMapping
    public List<Medecin> getAllMedecin() {
        return service.getAllMedecin();
    }

    @PostMapping
    public void registerMedecin(Medecin medecin) {

           service.postMedecin(medecin);

    }
}
