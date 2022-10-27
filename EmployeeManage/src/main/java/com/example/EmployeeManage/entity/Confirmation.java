package com.example.EmployeeManage.entity;

public class Confirmation {
	private String confirmationMessage;

	public Confirmation(String confirmationMessage) {
		super();
		this.confirmationMessage = confirmationMessage;
	}

	public String getConfirmationMessage() {
		return confirmationMessage;
	}

	public void setConfirmationMessage(String confirmationMessage) {
		this.confirmationMessage = confirmationMessage;
	}
	
}
