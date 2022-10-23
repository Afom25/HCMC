package com.example.holycrossmedicalcenter.controller;


import com.example.holycrossmedicalcenter.model.Patient;
import com.example.holycrossmedicalcenter.repository.PatientRepository;
import com.example.holycrossmedicalcenter.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/hcmcpatientmgmt/api/patient")
public class PatientRestController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/list")

    public List<Patient> dispalyallPatients(){
        return patientService.getpatientsSorted();

    }

}
