package com.example.holycrossmedicalcenter.service;

import com.example.holycrossmedicalcenter.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    public abstract List<Patient> getpatientsSorted();
}
