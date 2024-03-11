package org.personal.emp.repository;


import org.personal.emp.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Long> {

}
