package com.mido.erp.model.mapper;

import com.mido.erp.model.dto.EmployeeReqDto;
import com.mido.erp.model.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeReqDto toEmployerDTO(EmployeeEntity employer);

    EmployeeEntity toEmployer(EmployeeReqDto employerDTO);
}
