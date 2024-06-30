package com.mido.erp.controller;


import com.mido.erp.model.dto.EmployeeReqDto;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("employees")
public class EmployeeController {

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
}
