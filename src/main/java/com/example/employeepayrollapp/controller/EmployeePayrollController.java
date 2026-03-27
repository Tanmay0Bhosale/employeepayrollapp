package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import com.example.employeepayrollapp.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService service;

    @GetMapping("/")
    public List<EmployeePayrollData> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollData create(@Valid @RequestBody EmployeeDTO dto) {
        return service.createEmployee(dto);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData update(@PathVariable int id,
                                      @RequestBody EmployeeDTO dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted Successfully";
    }


}