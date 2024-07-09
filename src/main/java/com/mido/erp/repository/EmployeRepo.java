package com.mido.erp.repository;

import com.mido.erp.model.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepo extends JpaRepository <EmployeeEntity, Integer> {
}
