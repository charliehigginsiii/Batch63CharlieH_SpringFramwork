package com.example.EmployeeManage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="celebration")
@Table(name="celebration")
public class Celebration {
	@Id
	private long id;
	private String name;
	private float budget;
	private int countPpl;
	public Celebration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Celebration(long id, String name, float budget, int countPpl) {
		super();
		this.id = id;
		this.name = name;
		this.budget = budget;
		this.countPpl = countPpl;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
	public int getCountPpl() {
		return countPpl;
	}
	public void setCountPpl(int countPpl) {
		this.countPpl = countPpl;
	}
	
	
}
