package com.mido.erp.service;

import com.mido.erp.model.dto.EmployeeReqDto;
import com.mido.erp.model.dto.EmployeeResDto;
import com.mido.erp.model.entity.EmployeeEntity;

public interface EmployeService {
    EmployeeEntity getEmployerById(Integer id);
    EmployeeResDto createEmployer(EmployeeReqDto employerDTO);
//    List<EmployeeEntity> getAllEmployers();
//    void deleteEmployer(Long id);

}
