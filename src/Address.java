package com.capgemini.spring.organization.model;

public class Address{

	private String city;
	private String state;
	private int pincode;

	public void setCity(String city){
		this.city = city;
	}

	public void setState(String state){
		this.state = state;
	}

	public void setPincode(int pincode){
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "City: " + city +"\n" 
			+"State:" +state+ "\n"
			+"Pincode:" +pincode;
	}

}