package com.mido.erp.service.ServiceImp;

import com.mido.erp.model.dto.EmployeeReqDto;
import com.mido.erp.model.dto.EmployeeResDto;
import com.mido.erp.model.entity.EmployeeEntity;
import com.mido.erp.model.mapper.EmployeeMapper;
import com.mido.erp.repository.EmployeRepo;
import com.mido.erp.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeService{

    @Autowired
    private EmployeRepo employeRepo;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public EmployeeEntity getEmployerById(Integer id) {
        Optional<EmployeeEntity> employer = employeRepo.findById(id);
        if (employer.isPresent()) {
            return employer.get();
        } else {
            // Handle the case where the employer is not found
            // For example, throw an exception or return null
            throw new RuntimeException("Employer not found");
            // or return null;
        }
    }

    @Override
    public EmployeeResDto createEmployer(EmployeeReqDto employerDTO){
        EmployeeEntity employerEntity = new EmployeeEntity();
        EmployeeResDto resDto = new EmployeeResDto();
        employerEntity = this.employeeMapper.toEmployer(employerDTO);
        employeRepo.save(employerEntity);
        resDto = this.employeeMapper.toEmployerResDto(employerEntity);
        return resDto;
    }
}
