package com.cogent.spring.core.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.core.bean.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	

}
