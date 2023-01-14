package com.tutospring.webapp.model;

import lombok.Data;

@Data
public class Employee {

    private Integer id;

    private String firstName;

    private String lastName;

    private String mail;

    private String password;

    public Employee(){}

    public Employee(String firstName, String lastName, String mail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
    }
}
