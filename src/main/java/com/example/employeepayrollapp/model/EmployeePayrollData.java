package com.example.employeepayrollapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double salary;

    // Default Constructor
    public EmployeePayrollData() {}

    // Parameterized Constructor
    public EmployeePayrollData(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Salary
    public double getSalary() {
        return salary;
    }

    // Setter for Salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString() method (useful for debugging/logging)
    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}