package com.cogent;

public class Manager {
	public static void main(String[]args) {
		String channel="";
		
		if(channel.equals("mobile")) {
			SMSNotification smsNotification=new SMSNotification();
			smsNotification.notifyUser();
		}else if(channel.equals("laptop")){
			EmailNotification emailNotification=new EmailNotification();
			emailNotification.notifyUser();
		}
	}
}
