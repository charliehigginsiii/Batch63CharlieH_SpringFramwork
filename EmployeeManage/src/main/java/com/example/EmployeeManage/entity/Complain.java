package com.example.EmployeeManage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Complain {
	@Id
	private int id;
	private String status;
	public Complain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complain(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
