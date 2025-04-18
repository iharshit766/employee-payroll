package com.bridgelabz.employee_payroll.service;

import com.bridgelabz.employee_payroll.EmployeePayrollApplication;
import com.bridgelabz.employee_payroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employee_payroll.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    private List<EmployeePayrollData> employeeList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployee() {
        return employeeList;
    }

    @Override
    public EmployeePayrollData getEmployeeById(Long empId) {
        return employeeList.get((int) (empId - 1));
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeePayrollDTO employeeDTO) {
        EmployeePayrollData employee = null;
        employee = new EmployeePayrollData((long) employeeList.size() + 1, employeeDTO);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public EmployeePayrollData updateEmployee(Long employeeId, EmployeePayrollDTO employeeDTO) {
        EmployeePayrollData employee = null;
        employee = new EmployeePayrollData(employeeId);
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employeeList.set((int) (employeeId - 1), employee);
        return employee;
    }

    @Override
    public void deleteEmployee(Long empId) {
        employeeList.remove((int) (empId - 1));
    }
}