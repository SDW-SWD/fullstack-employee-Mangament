package org.personal.emp.service;


import org.personal.emp.dto.EmployeeDto;
import org.personal.emp.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity createEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> retriveEmployees();
    boolean removeEmployee(Long employeeId);

    EmployeeEntity updateEmployee(Long employeeId, EmployeeDto employeeDto);

    EmployeeDto getBookById(Long id);



}
