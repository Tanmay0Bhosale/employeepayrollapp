package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getAllEmployees();

    EmployeePayrollData getEmployeeById(int id);

    EmployeePayrollData createEmployee(EmployeeDTO dto);

    EmployeePayrollData updateEmployee(int id, EmployeeDTO dto);

    void deleteEmployee(int id);
}