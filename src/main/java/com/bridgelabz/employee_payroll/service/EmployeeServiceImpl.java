package com.bridgelabz.employee_payroll.service;

import com.bridgelabz.employee_payroll.EmployeePayrollApplication;
import com.bridgelabz.employee_payroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employee_payroll.model.EmployeePayrollData;
import com.bridgelabz.employee_payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    private EmployeeRepository repository;
    private List<EmployeePayrollData> employeeList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployee() {
        return repository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeeById(Long empId) {

        return employeeList.get((int) (empId - 1));
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeePayrollDTO employeeDTO) {
        EmployeePayrollData employee = new EmployeePayrollData();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employeeList.add(employee);
        return repository.save(employee);
    }

    @Override
    public EmployeePayrollData updateEmployee(Long employeeId, EmployeePayrollDTO employeeDTO) {
        EmployeePayrollData employee = repository.findById(employeeId).orElse(null);
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());

        return repository.save(employee);
    }

    @Override
    public void deleteEmployee(Long empId) {
        repository.deleteById(empId);
    }
}