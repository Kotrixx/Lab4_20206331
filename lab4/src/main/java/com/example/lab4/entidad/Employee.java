package com.example.lab4.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer employeeId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)

    private String lastName;

    @Column(nullable = false)
    private String email;

    private String password;

    private String phoneNumber;

    private Timestamp hireDate;


    private String jobId;


    private BigDecimal salary;

    private BigDecimal commissionPct;
    private Integer managerId;
    private Integer departmentId;
    private Integer enabled;
}
