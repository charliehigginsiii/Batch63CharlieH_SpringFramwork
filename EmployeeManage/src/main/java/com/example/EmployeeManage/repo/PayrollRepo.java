package com.example.EmployeeManage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManage.entity.Payroll;

public interface PayrollRepo extends JpaRepository<Payroll,Integer> {

}
