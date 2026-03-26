package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Override
    public List<EmployeePayrollData> getAllEmployees() {
        return null;
    }

    @Override
    public EmployeePayrollData getEmployeeById(int id) {
        return null;
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeeDTO dto) {
        return null;
    }

    @Override
    public EmployeePayrollData updateEmployee(int id, EmployeeDTO dto) {
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
    }
}