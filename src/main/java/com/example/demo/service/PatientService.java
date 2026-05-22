package com.example.demo.service;

import com.example.demo.repository.PatientRepository;
import com.example.demo.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;

    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
    }

    public Patient updatePatient(Long id, Patient patient) {
        Patient existingPatient = getPatientById(id);

        existingPatient.setName(patient.getName());
        existingPatient.setAge(patient.getAge());
        existingPatient.setEmail(patient.getEmail());
        existingPatient.setPhoneNo(patient.getPhoneNo());

        return patientRepository.save(existingPatient);
    }

    public void deletePatient(Long id) {
        Patient existingPatient = getPatientById(id);
        patientRepository.delete(existingPatient);
    }
}
