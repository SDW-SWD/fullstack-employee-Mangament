package org.personal.emp.controller;

import org.personal.emp.dto.EmployeeDto;
import org.personal.emp.entity.EmployeeEntity;
import org.personal.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    EmployeeEntity createEmployee(@RequestBody EmployeeDto employeeDto) {
        return service.createEmployee(employeeDto);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    List<EmployeeDto> getEmployee () {
        return service.retriveEmployees();
    }




}
