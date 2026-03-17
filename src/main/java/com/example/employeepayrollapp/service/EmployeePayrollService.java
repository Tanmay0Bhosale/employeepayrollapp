package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import com.example.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    public List<EmployeePayrollData> getAllEmployees() {
        return repository.findAll();
    }

    public EmployeePayrollData getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeePayrollData createEmployee(EmployeeDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(dto.name, dto.salary);
        return repository.save(emp);
    }

    public EmployeePayrollData updateEmployee(int id, EmployeeDTO dto) {
        EmployeePayrollData emp = repository.findById(id).orElse(null);
        if (emp != null) {
            emp.setName(dto.name);
            emp.setSalary(dto.salary);
            return repository.save(emp);
        }
        return null;
    }

    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}