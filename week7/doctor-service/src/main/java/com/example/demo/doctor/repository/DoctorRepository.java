package com.example.demo.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.doctor.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {}