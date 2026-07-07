package com.bank.app.model;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastname;

    @Column(unique = true)
    private String email;
    private String phoneNumber;
}
