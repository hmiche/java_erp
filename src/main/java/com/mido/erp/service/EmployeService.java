package com.mido.erp.service;

import com.mido.erp.model.entity.EmployeeEntity;

import java.util.List;

public interface EmployeService {
    EmployeeEntity getEmployerById(Long id);
    EmployeeEntity createEmployer(EmployeeEntity employerDTO);
//    List<EmployeeEntity> getAllEmployers();
//    void deleteEmployer(Long id);

}
