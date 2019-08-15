package comp.hef.method_5th;

import java.util.Scanner;

public class CalcVolume_1st {
int length,width,depth;

Scanner sc=new Scanner(System.in);

		void volume() {
			System.out.println("Enter length of box");
			length=sc.nextInt();
			System.out.println("Enter width of box");
			width=sc.nextInt();
			System.out.println("Enter depth of box");
			depth=sc.nextInt();
			
			
			int volume=length*width*depth;
			System.out.println("volume of box is "+volume);
			
			
			
			
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcVolume_1st ob=new CalcVolume_1st();
		ob.volume();
	}

}
