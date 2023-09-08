package com.example.lab4.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,length = 40)
    private Integer countryId;
    @Column(nullable = false,length = 40)
    private String countryName;

    @Column(nullable = false,length = 40)
    private BigDecimal regionId;


}
