package com.tutospring.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutospring.webapp.model.Employee;
import com.tutospring.webapp.repository.EmployeeProxy;


@SpringBootApplication
public class WebAppApplication implements CommandLineRunner {
// public class WebAppApplication {


    @Autowired
    private CustomProperties properties;

    @Autowired
    private EmployeeProxy employeeProxy;

    private Iterable<Employee> employees;

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {

        System.out.println(properties.getApiUrl());

        employees = employeeProxy.getEmployees();

        System.out.println("Response body: ");
        for(Employee e : employees) System.out.println(e.toString());

    }

}
