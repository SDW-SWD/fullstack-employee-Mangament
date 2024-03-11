package org.personal.emp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String firstName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Address")
    private String Address;

    @Column(name = "City")
    private String city;

    @Column(name = "Province")
    private String province;

    @Column(name = "Description")
    private String Description;

}
