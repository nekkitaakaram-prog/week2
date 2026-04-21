package com.example.demo.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.doctor.entity.Doctor;
import com.example.demo.doctor.repository.DoctorRepository;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repo;

    // Add new doctor
    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return repo.save(doctor);
    }

    // Get all doctors
    @GetMapping
    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }

    // Get doctor by id
    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }
}