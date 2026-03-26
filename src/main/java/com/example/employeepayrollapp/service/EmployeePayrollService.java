package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeePayrollData> employeeList = new ArrayList<>();
    private int empIdCounter = 1;

    @Override
    public List<EmployeePayrollData> getAllEmployees() {
        return employeeList;
    }

    @Override
    public EmployeePayrollData getEmployeeById(int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeeDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(
                empIdCounter++,
                dto.name,
                dto.salary
        );
        employeeList.add(emp);
        return emp;
    }

    @Override
    public EmployeePayrollData updateEmployee(int id, EmployeeDTO dto) {
        EmployeePayrollData emp = getEmployeeById(id);
        if (emp != null) {
            emp.setName(dto.name);
            emp.setSalary(dto.salary);
        }
        return emp;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeList.removeIf(emp -> emp.getId() == id);
    }
}