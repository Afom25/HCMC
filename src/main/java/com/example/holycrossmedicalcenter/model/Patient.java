package com.example.holycrossmedicalcenter.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long patientId;


    @NotBlank(message = "patientnumber cant be blank")
    @Column(nullable=false)
    private String patientNumber;

    @NotBlank(message = "yes or no ")
    @Column(nullable=false)
    private String isAnOutPatient;

    @NotBlank(message="fullnames cant be blank or empty")
    @Column(nullable = false)
    private String fullNames;

    @Column(nullable = true)
    private String emailAddress;

    @Column(nullable = true)
    private String contactPhoneNumber;
    @NotNull(message ="datebirth cant be null")
    private LocalDate dateofBirth;

    public Patient(Long patientId, String patientNumber, String isAnOutPatient, String fullNames, String emailAddress, String contactPhoneNumber, LocalDate dateofBirth) {
        this.patientId = patientId;
        this.patientNumber = patientNumber;
        this.isAnOutPatient = isAnOutPatient;
        this.fullNames = fullNames;
        this.emailAddress = emailAddress;
        this.contactPhoneNumber = contactPhoneNumber;
        this.dateofBirth = dateofBirth;
    }

    public Patient() {

    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getIsAnOutPatient() {
        return isAnOutPatient;
    }

    public void setIsAnOutPatient(String isAnOutPatient) {
        this.isAnOutPatient = isAnOutPatient;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
}
