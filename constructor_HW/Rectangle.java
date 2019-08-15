package comp.hef.constructor_HW;

/*
5.	Create a class named 'Rectangle' with two data members- 
	length and breadth and a method to calculate the area which is 'length*breadth'. 
	The class has three constructors which are: 
1 - having no parameter - values of both length and breadth are assigned zero.
2 - Having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - Having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.

*/
public class Rectangle {
	static int length;
	static int bredth;
	int Area;

	public Rectangle() {
		// TODO Auto-generated constructor stub
		Area = length * bredth;
	}

	public Rectangle(int length) {
this.length=length;
this.bredth=length;								//length value is assign to bredth
//		Area=length*bredth;
		
	}
	
	public Rectangle(int length,int bredth) {
		this.length=length;
		this.bredth=bredth;
		
		Area=length*bredth;
			
	}
	void calcArea() {
		Area = length * bredth;
	System.out.println(Area);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle ob=new Rectangle();
ob.calcArea();
Rectangle ob1=new Rectangle(20);
ob1.calcArea();
Rectangle ob2=new Rectangle(10, 20);
ob2.calcArea();
	}

}
