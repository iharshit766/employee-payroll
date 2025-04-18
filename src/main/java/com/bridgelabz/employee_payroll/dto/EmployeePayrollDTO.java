package com.bridgelabz.employee_payroll.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class EmployeePayrollDTO {

    private String name;
    private double salary;
}
//    public EmployeePayrollDTO(String name, double salary){
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public EmployeePayrollDTO(){}
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//}