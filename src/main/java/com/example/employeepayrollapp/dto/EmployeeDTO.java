package com.example.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class EmployeeDTO {

    @NotBlank(message = "Name cannot be empty")
    public String name;

    @Min(value = 500, message = "Salary must be greater than 500")
    public double salary;
}