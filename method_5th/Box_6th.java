package comp.hef.method_5th;

import java.util.Scanner;

public class Box_6th {
	int height,width,depth;
	int result;
	Scanner sc=new Scanner(System.in);
	
	double calcvolume() {
		
	System.out.println("Enter height of box");
	height=sc.nextInt();
	System.out.println("Enter Width of box");
	width=sc.nextInt();
	System.out.println("Enter depth of box");
	depth=sc.nextInt();
	
	result=height*width*depth;
	
	
	return result;
	
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box_6th ob=new Box_6th();
		ob.calcvolume();
		System.out.println("volume of box is"+ob.result);
			
	}

}
