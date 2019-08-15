package com.hef.inheritance;

/*
8.	Create class Person which has attributes (name, gender, age, Address). Address is class which has attributes 
(city, state, country). Display Persons data 
Note. Containment using constructor and getter/setter 

*/
public class Person {
	String name;
	String gender;
	int age;
	
	Address Address;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String gender, int age, Address address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.Address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", Address=" + Address + "]";
	}

}
