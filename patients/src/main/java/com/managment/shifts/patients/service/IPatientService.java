package com.managment.shifts.patients.service;

import com.managment.shifts.patients.model.Patient;

import java.util.List;

public interface IPatientService {

    List<Patient> getPatients();
    void savePatient(Patient patient);
    void editPatient(Patient patient);
    void deletePatient(Long id);
    Patient findPatientById(Long id);
}
