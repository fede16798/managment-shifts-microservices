package com.managment.shifts.patients.service;

import com.managment.shifts.patients.model.Patient;
import com.managment.shifts.patients.repository.IPatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IPatientService{

    private final IPatientRepository patientRepository;

    public PatientService (IPatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void editPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient findPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
}
