package com.example.demo.patient.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.patient.entity.Patient;
import com.example.demo.patient.repository.PatientRepository;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repo;

    @PostMapping
    public Patient addPatient(@RequestBody Patient p){
        return repo.save(p);
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id){
        return repo.findById(id).orElse(null);
    }

    @GetMapping
    public List<Patient> getAllPatients(){
        return repo.findAll();
    }
}