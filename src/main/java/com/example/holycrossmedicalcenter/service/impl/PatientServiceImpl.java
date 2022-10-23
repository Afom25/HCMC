package com.example.holycrossmedicalcenter.service.impl;

import com.example.holycrossmedicalcenter.model.Patient;
import com.example.holycrossmedicalcenter.repository.PatientRepository;
import com.example.holycrossmedicalcenter.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {


    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getpatientsSorted() {
        return patientRepository.findAll(Sort.by(Sort.Direction.ASC,"fullNames"));

    }
}
