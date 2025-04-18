package com.bridgelabz.employee_payroll.repository;


import com.bridgelabz.employee_payroll.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeePayrollData, Long> {
}