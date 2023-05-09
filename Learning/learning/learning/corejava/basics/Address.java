package com.learning.corejava.basics;

// Encapsulation : Wrapping of data or encapsulate the data or binding the data & function together.

public class Address {
	private String street;
	private String city;
	private String state;
	private int pin;
	
	// getter and setter methods
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String s) {
		this.street=s;	
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}		
	
	
}
