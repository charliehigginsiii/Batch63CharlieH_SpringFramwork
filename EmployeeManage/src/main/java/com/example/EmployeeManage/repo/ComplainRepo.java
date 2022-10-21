package com.example.EmployeeManage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManage.entity.Complain;

public interface ComplainRepo extends JpaRepository<Complain,Integer> {

}
