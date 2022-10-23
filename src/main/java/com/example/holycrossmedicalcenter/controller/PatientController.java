package com.example.holycrossmedicalcenter.controller;


import com.example.holycrossmedicalcenter.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hcmcpatientmgmt/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping(value="/list")
    public ModelAndView dispalyOfPatinets() {
        var modelAndView = new ModelAndView();
        modelAndView.addObject("patients", patientService.getpatientsSorted());
        modelAndView.setViewName("patientList");
        return modelAndView;

    }
}
