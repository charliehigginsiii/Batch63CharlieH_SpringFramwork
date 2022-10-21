package com.example.EmployeeManage.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.EmployeeManage.entity.*;

@Component
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
