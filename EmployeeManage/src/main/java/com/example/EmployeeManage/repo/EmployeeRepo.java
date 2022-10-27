package com.example.EmployeeManage.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.EmployeeManage.entity.*;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

	//Customize 
	@Transactional
	@Query(value="select e from employee e order by name asc")
	public List<Employee> findAllSortedByName();
	
	@Transactional
	@Query(value="select * from employee where salary>=:salary",nativeQuery=true)
	public List<Employee> findBySalary(@Param(value="salary")float salary);
	
	@Transactional
	@Modifying
	@Query(value="delete from employee  where name=:name",nativeQuery=true)
	public  int deleteByName(@Param(value="name")String name);
	
	@Transactional
	@Modifying
	@Query (value="update employee set name=:name  where id=:id",nativeQuery=true)
	public Integer updateEmployeeName(@Param(value="name")String name, @Param(value="id" )long id);
	
	@Transactional
	@Modifying
	@Query (value="update employee set dept=:dept  where id=:id",nativeQuery=true)
	public Integer updateEmployeeDept(@Param(value="dept")String dept, @Param(value="id" )long id);

	@Transactional
	@Modifying
	@Query (value="update employee set salary=:salary  where id=:id",nativeQuery=true)
	public Integer updateEmployeeSalary(@Param(value="salary")float salary, @Param(value="id" )long id);
}
