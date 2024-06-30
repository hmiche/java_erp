package com.mido.erp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("employees")
public class EmployeeController {

    @GetMapping ("/get-employee")
    public String getEmployee(){
        return "Ahmed";
    }
}
