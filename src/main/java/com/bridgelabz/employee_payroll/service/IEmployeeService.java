package com.bridgelabz.employee_payroll.service;

import com.bridgelabz.employee_payroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employee_payroll.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeeService {
    List<EmployeePayrollData> getEmployee();
    EmployeePayrollData getEmployeeById(Long empId);
    EmployeePayrollData createEmployee(EmployeePayrollDTO employeeDTO);
    EmployeePayrollData updateEmployee(Long employeeId, EmployeePayrollDTO employeeDTO);
    void deleteEmployee(Long empId);
}