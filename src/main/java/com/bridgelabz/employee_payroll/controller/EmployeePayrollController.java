package com.bridgelabz.employee_payroll.controller;


import com.bridgelabz.employee_payroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employee_payroll.dto.ResponseDTO;
import com.bridgelabz.employee_payroll.model.EmployeePayrollData;
import com.bridgelabz.employee_payroll.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeeData(){
        List<EmployeePayrollData> employeeList = null;
        employeeList = employeeService.getEmployee();
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", employeeList);

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeeData(@PathVariable Long empId){
        EmployeePayrollData emp = null;
        emp = employeeService.getEmployeeById(empId);
        ResponseDTO responseDTO = new ResponseDTO("Get call for Id successful", emp);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeeData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData emp = null;
        emp = employeeService.createEmployee(employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data successfully",emp);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeeData(@RequestBody EmployeePayrollDTO employeePayrollDTO, @PathVariable Long empId){
        EmployeePayrollData emp = null;
        emp = employeeService.updateEmployee(empId, employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data successfully",emp);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeeData(@PathVariable Long empId){
        employeeService.deleteEmployee(empId);

        ResponseDTO responseDTO = new ResponseDTO("Deleted ID: " + empId,"Deleted Successfully");
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}

