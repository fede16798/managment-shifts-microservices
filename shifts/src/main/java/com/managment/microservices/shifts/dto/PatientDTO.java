package com.managment.microservices.shifts.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {

    private Long id;
    private String documentId;
    private String name;
    private String lastname;
    private Date birthdate;
    private String phone;
}
