package comp.hef.constructor_HW;
/*
7.	Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, 
then the message "I love programming languages" should be printed. If some String is passed to it, 
then in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.

*/
public class Programming {

	public Programming() {
		// TODO Auto-generated constructor stub
	
	System.out.println("i love Programming languages");
	}
	Programming(String a){
		System.out.println("i love "+a);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Programming ob=new Programming();
Programming ob1=new Programming("java");
	}

}
