package com.mido.erp.model.mapper;

import com.mido.erp.model.dto.EmployeeReqDto;
import com.mido.erp.model.dto.EmployeeResDto;
import com.mido.erp.model.entity.EmployeeEntity;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeReqDto toEmployerDTO(EmployeeEntity employer);

    EmployeeEntity toEmployer(EmployeeReqDto employerDTO);

    EmployeeResDto toEmployerResDto(EmployeeEntity employer);
}
