package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;
import com.example.employeepayrollapp.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService service;

    // GET ALL
    @GetMapping("/")
    public List<EmployeePayrollData> getAll() {
        return service.getAllEmployees();
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public EmployeePayrollData getById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    // CREATE
    @PostMapping("/create")
    public EmployeePayrollData create(@RequestBody EmployeeDTO dto) {
        return service.createEmployee(dto);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public EmployeePayrollData update(@PathVariable int id, @RequestBody EmployeeDTO dto) {
        return service.updateEmployee(id, dto);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted Successfully";
    }
}