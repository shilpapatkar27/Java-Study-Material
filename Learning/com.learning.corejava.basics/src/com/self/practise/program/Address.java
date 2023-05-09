package com.self.practise.program;

// H.W: Define another class called as Address containing attributes - street, city, state, pin

public class Address {
	private String street;
	private String city;
	private String state;
	private long pin;
	
	public Address(String street, String city, String state, long pin) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}
	
	
	
	
	

}
