package com.hef.poly_encaps;

/*5.In our FaceBook profile,  we would like to hide the age, marital status and phone number 
information to the external world. This can be done using encapsulation where the 
fields are made private and can be accessed only by the accessor(getter) and mutator (setter)methods.  
*/
class Hidedata {
	private int age;
	private String matarialStatus;
	private String PhoneNumber;

	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	public String getMatarialStatus() {
		return matarialStatus;
	}

	public void setMatarialStatus(String matarialStatus) {
		this.matarialStatus = matarialStatus;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

}

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hidedata ob=new Hidedata();
ob.setAge(10);
ob.setMatarialStatus("Single");
ob.setPhoneNumber("9122334455");

	System.out.println("age "+ob.getAge());
	System.out.println("matarial status "+ob.getMatarialStatus());
	System.out.println("PhoneNumber "+ob.getPhoneNumber());
	
	
	
	}

}
