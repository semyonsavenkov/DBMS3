package org.example.dbms3test.model;

public record Customer(
        int id,
        String name,
        String sureName,
        int age,
        String phone_number
) {}
