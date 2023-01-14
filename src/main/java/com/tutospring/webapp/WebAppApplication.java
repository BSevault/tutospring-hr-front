package com.tutospring.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutospring.webapp.model.Employee;
import com.tutospring.webapp.repository.EmployeeProxy;


@SpringBootApplication
// public class WebAppApplication implements CommandLineRunner {
public class WebAppApplication {


    @Autowired
    private CustomProperties properties;

    // @Autowired
    // private EmployeeProxy employeeProxy;

    // private Employee employee;
    // private Employee newEmployee;

    // private Iterable<Employee> employees;

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
    }



    // @Override
    // public void run(String... args) throws Exception {
    //
    //     System.out.println(properties.getApiUrl());
    //
    //     employees = employeeProxy.getEmployees();
    //
    //     employee = new Employee("Peppa", "Pig", "pepp@pig.com", "oink!");
    //     System.out.println(employee.toString());
    //
    //     // System.out.println("Response body: ");
    //     // for(Employee e : employees) System.out.println(e.toString());
    //
    //
    //     employeeProxy.createEmployee(employee);
    //     // newEmployee = employeeProxy.createEmployee(employee);
    //
    //     System.out.println(newEmployee.toString());
    //
    // }

}
