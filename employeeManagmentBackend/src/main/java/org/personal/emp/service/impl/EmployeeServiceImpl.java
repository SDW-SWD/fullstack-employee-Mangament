package org.personal.emp.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.personal.emp.dto.EmployeeDto;
import org.personal.emp.entity.EmployeeEntity;
import org.personal.emp.repository.EmployeeRepository;
import org.personal.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;
    @Autowired
    ObjectMapper mapper;
    @Override
    public EmployeeEntity createEmployee(EmployeeDto employeeDto) {
        EmployeeEntity entity = mapper.convertValue(employeeDto, EmployeeEntity.class);
        return repository.save(entity);
    }

    @Override
    public List<EmployeeDto> retriveEmployees() {
        ArrayList<EmployeeDto> list = new ArrayList<>();
        Iterable<EmployeeEntity> employeeList = repository.findAll();
        Iterator<EmployeeEntity> iterator = employeeList.iterator();
        while (iterator.hasNext()){
            EmployeeEntity entity = iterator.next();
            EmployeeDto employeeDto = mapper.convertValue(entity, EmployeeDto.class);
            list.add(employeeDto);
        }
        return list;
    }

    @Override
    public boolean removeEmployee(Long employeeId) {
        return false;
    }

    @Override
    public EmployeeEntity updateEmployee(Long employeeId, EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public EmployeeDto getBookById(Long id) {
        return null;
    }
}
