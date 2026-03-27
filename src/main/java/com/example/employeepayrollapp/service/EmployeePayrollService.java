package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import com.example.employeepayrollapp.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    @Override
    public List<EmployeePayrollData> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeeDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(
                dto.name,
                dto.salary
        );
        return repository.save(emp);
    }

    @Override
    public EmployeePayrollData updateEmployee(int id, EmployeeDTO dto) {
        EmployeePayrollData emp = getEmployeeById(id);
        if (emp != null) {
            emp.setName(dto.name);
            emp.setSalary(dto.salary);
            return repository.save(emp);
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}