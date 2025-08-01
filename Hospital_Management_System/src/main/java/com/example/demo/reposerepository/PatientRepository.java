package com.example.demo.reposerepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
