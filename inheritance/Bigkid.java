package com.hef.inheritance;
/*
6.	WAP to create a class Kid with method readBook() and another method readBook () with 2 parameters. 
The method readBook here is over-loaded (same method name but different parameters).
Create a class BigKid which extends Kid created above. Implement readBook()
 differently in BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()
*/

class kid {
	void readbook() {
	System.out.println("kids read books");
	
	
	}
void readbook(int a,int b) {
	System.out.println("kids read "+a+" books for "+b+" times");
}

}


public class Bigkid extends kid{
	
	void readbook() {
		System.out.println("Big kids read the books");
	}
	void readbook(int a,int b) {
		System.out.println("Big kids read "+a+" books for "+b+" times");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
kid ob=new kid();
ob.readbook();
ob.readbook(2, 1);

Bigkid ob1=new Bigkid();
ob1.readbook();
ob1.readbook(2, 4);


	}

}
