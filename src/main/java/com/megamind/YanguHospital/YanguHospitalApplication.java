package com.megamind.YanguHospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.megamind.YanguHospital.patient.Patient;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class YanguHospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(YanguHospitalApplication.class, args);
    }

}
