package com.managment.shifts.patients.controller;

import com.managment.shifts.patients.model.Patient;
import com.managment.shifts.patients.service.IPatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final IPatientService patientService;

    public PatientController (IPatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<Patient> createPatient (@RequestBody Patient patient) {
        patientService.savePatient(patient);

        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Patient>> getPatients () {
        return new ResponseEntity<>(patientService.getPatients(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient (@PathVariable Long id) {
        patientService.deletePatient(id);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping()
    public ResponseEntity<Patient> editPatient (@RequestBody Patient patient) {
       patientService.editPatient(patient);
       Patient patientEdited = patientService.findPatientById(patient.getId());
       return new ResponseEntity<>(patientEdited, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById (@PathVariable Long id) {
        return new ResponseEntity<>(patientService.findPatientById(id), HttpStatus.OK);
    }

}
