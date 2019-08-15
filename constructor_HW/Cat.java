package comp.hef.constructor_HW;
//2.	Create one class Cat and create only one but parameterized constructor. And create one object like     
// Cat c = new Cat (); 
// It will give error since you have defined your own parameterized constructor, Java does not provide default one.
public class Cat {

	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	Cat(int a){
		
		System.out.println("this is no args constructor");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat ob=new Cat();				//it does not call parameterized
										//compiler cant call constructor,u have to call them manually  

	}

}