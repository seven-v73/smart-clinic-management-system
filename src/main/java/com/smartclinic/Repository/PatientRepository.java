package com.smartclinic.repository;

import com.smartclinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Derived Query: Retrieve patient by exact email
    Optional<Patient> findByEmail(String email);

    // Derived Query: Retrieve patient by email OR phone number
    Optional<Patient> findByEmailOrPhoneNumber(String email, String phoneNumber);
}