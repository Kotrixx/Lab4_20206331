package com.example.lab4.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "locations")
@Getter
@Setter
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer locationId;

    @Column(nullable = false)
    private String StreetAddress;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String CountryId;

}
