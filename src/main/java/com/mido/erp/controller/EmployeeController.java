package com.mido.erp.controller;


import com.mido.erp.model.dto.EmployeeReqDto;
import com.mido.erp.model.dto.EmployeeResDto;
import com.mido.erp.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    EmployeService employeeService;

    @GetMapping ("/get-employee")
    public String getEmployee(@RequestParam(name = "username") String username){
        return username;
    }

    @GetMapping ("/get-employee/username/{username}")
    public String getEmployeebypathparam(@PathVariable(name = "username") String username){
        return username;
    }

    @PostMapping  ("save-employee")
    public void save(@RequestBody EmployeeReqDto req){
        System.out.println("request : "+req);
    }


    @PostMapping("create-employee")
    public EmployeeResDto createEmploye(@RequestBody EmployeeReqDto req){
        EmployeeResDto res = new EmployeeResDto();
        res = employeeService.createEmployer(req);
        return res;
    }
}
