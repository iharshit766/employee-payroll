package com.bridgelabz.employee_payroll.service;

import com.bridgelabz.employee_payroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employee_payroll.model.EmployeePayrollData;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService implements IEmployeeService {

    public List<EmployeePayrollData> getEmployeePayrollData(){
        List<EmployeePayrollData> empDataList= new ArrayList<>();
        empDataList.add(new EmployeePayrollData(1L, new EmployeePayrollDTO("Pankaj",30000)));
        return empDataList;
    }

    public EmployeePayrollData getEmployeeById(int empID){
        EmployeePayrollData empData=null;
        empData= new EmployeePayrollData(1L, new EmployeePayrollDTO("pankaj",30000));
        return empData;
    }

    @Override
    public List<EmployeePayrollData> getEmployee() {
        return List.of();
    }

    @Override
    public EmployeePayrollData getEmployeeById(Long empId) {
        return null;
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeePayrollDTO employeeDTO) {
        return null;
    }

    @Override
    public EmployeePayrollData updateEmployee(Long employeeId, EmployeePayrollDTO employeeDTO) {
        return null;
    }



    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData empData=null;
        empData= new EmployeePayrollData(1L,employeePayrollDTO);
        return empData;
    }

    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData empData= null;
        empData= new EmployeePayrollData(1L, employeePayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployee(Long empId) {

    }

    public void deleteEmployeePayrollData(int empId){

    }


}
