package comp.hef.constructor_HW;
/*
8.	Create a class Student with int id and String name as member variables. Generate getter and setter methods 
for id and name. Observe in the generated setter method how the parameter’s value is assigned to the member 
variable using this keyword. What would happen in the setter method if you remove ‘this.’ when assigning the 
parameter value?
In main create 2 objects of Student. Set id of first student to 11 and 21 to the other student’s id. 
Check and observe if you can use ‘this’ in main method.

*/
public class Student_8th {
	int id;
	String name;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student_8th ob=new Student_8th();
ob.setId(11);
	Student_8th ob2=new Student_8th();
	ob2.setId(21);

	}

}
