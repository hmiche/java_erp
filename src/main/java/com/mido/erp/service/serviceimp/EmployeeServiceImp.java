package com.mido.erp.service.serviceimp;

import com.mido.erp.model.entity.EmployeeEntity;
import com.mido.erp.repository.EmployeRepo;
import com.mido.erp.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImp implements EmployeService {


    @Autowired
    private EmployeRepo empRepo;

    @Override
    EmployeeEntity getEmployerById(Long id){


    }
}
