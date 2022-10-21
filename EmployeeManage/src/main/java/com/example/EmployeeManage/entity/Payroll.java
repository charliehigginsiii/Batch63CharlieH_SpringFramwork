package com.example.EmployeeManage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Payroll {
	@Id
	private int id;
	private String name;
	private double amount;
	private double taxPaid;
	private int daysWorking;
	public Payroll(int id, String name, double amount, double taxPaid, int daysWorking) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.taxPaid = taxPaid;
		this.daysWorking = daysWorking;
	}
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTaxPaid() {
		return taxPaid;
	}
	public void setTaxPaid(double taxPaid) {
		this.taxPaid = taxPaid;
	}
	public int getDaysWorking() {
		return daysWorking;
	}
	public void setDaysWorking(int daysWorking) {
		this.daysWorking = daysWorking;
	}
	@Override
	public String toString() {
		return "Payroll [id=" + id + ", name=" + name + ", amount=" + amount + ", taxPaid=" + taxPaid + ", daysWorking="
				+ daysWorking + "]";
	}
	
}
