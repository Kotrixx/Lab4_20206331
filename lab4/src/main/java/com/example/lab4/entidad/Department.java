package com.example.lab4.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "departments")
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer departmentId;

    @Column(nullable = false)
    private String departmentName;

    @Column(nullable = false)
    private Integer managerId;

    @Column(nullable = false)
    private String locationId;

}
