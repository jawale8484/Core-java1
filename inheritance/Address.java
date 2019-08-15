package com.hef.inheritance;
//Address is class which has attributes 
//(city, state, country).
public class Address {
	String city;
	String State;
	String Country;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String city,String State,String Country) {
		// TODO Auto-generated constructor stub
	this.city=city;
	this.State=State;
	this.Country=Country;
	}

	public String getCity() {
		
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", Country=" + Country + "]";
	}

}
