package edu.clothing.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "BillingInfo")
public class BillingInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PaymentID")
    private String paymentId ;

    @Column(name = "OrderID")
    private String orderId;

    @Column(name = "CustomerID")
    private String customerID ;

    @Column(name = "Address")
    private String address;

    @Column(name ="Contact")
    private String phone;
}
