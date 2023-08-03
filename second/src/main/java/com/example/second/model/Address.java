package com.example.second.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long address_id;

    @Column(name = "city")
    private String city;

    @Column(name = "addressType")
    private String addressType;

    // @OneToOne(mappedBy = "address")
    // private Employee employee;
}
