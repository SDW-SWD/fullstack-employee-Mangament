package edu.clothing.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CustomerID")
    private String customerId ;

    @Column(name = "Email")
    private String mail;

    @Column(name = "UserName")
    private String name ;

    @Column(name = "Address")
    private String address;

    @Column(name ="Contact")
    private String phone;
}
