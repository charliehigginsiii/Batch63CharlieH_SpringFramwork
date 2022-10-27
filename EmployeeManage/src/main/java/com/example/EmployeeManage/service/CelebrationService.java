package com.example.EmployeeManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManage.entity.Celebration;
import com.example.EmployeeManage.entity.Employee;
import com.example.EmployeeManage.repo.CelebrationRepo;

@Service
public class CelebrationService {
	@Autowired
	CelebrationRepo celebrationRepo;
	
	public Celebration addCelebration(Celebration celebration) {
		return celebrationRepo.save(celebration);
	}
	public List<Celebration> getCelebrations() {
		return celebrationRepo.findAll();
	}
	public List<Celebration> performSorting() {
		return celebrationRepo.findAllSortedByName();
	}
	public List<Celebration> findCelebrationByBudget(float budget){
		return celebrationRepo.findByBudget(budget);
	}
	public int deleteCelebrationByName(String name) {
		celebrationRepo.deleteByName(name);
		return 1;
	}
}
