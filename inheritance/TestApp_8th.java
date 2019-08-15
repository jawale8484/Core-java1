package com.hef.inheritance;

public class TestApp_8th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address address=new Address();
address.setCity("pune");
address.setCountry("India");
address.setState("maharastra");

Person person=new Person();
person.setName("rohan");
person.setGender("male");
person.setAge(20);
person.setAddress(address);

System.out.println(person);
	}

}
