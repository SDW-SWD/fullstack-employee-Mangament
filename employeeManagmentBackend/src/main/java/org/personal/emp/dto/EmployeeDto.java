package org.personal.emp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private  Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String Address;
    private String city;
    private String province;
    private String department;
    private String Description;
}
