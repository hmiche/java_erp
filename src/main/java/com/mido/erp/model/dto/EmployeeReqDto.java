package com.mido.erp.model.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class EmployeeReqDto {
    private String username;
    private String password;
    private String email;
}

