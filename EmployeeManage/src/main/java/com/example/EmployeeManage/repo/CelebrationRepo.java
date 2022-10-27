package com.example.EmployeeManage.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.EmployeeManage.entity.Celebration;
import com.example.EmployeeManage.entity.Employee;

public interface CelebrationRepo extends JpaRepository<Celebration,Long>  {
	//Customize 
		@Transactional
		@Query(value="select c from celebration c order by name asc")
		public List<Celebration> findAllSortedByName();
		
		@Transactional
		@Query(value="select * from celebration where budget>=:budget",nativeQuery=true)
		public List<Celebration> findByBudget(@Param(value="budget")float budget);
		
		@Transactional
		@Modifying
		@Query(value="delete from celebration  where name=:name",nativeQuery=true)
		public  int deleteByName(@Param(value="name")String name);
}
