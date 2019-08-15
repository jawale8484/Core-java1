package comp.hef.method_5th;

import java.util.Scanner;

/*7.	Create a class to print an integer and a character with two methods having the same name but 
		different sequence of the integer and the character.
		parameters.For example, if the parameters of the first method are of the 
		form (int n, char c), then that of the second method will be of the form (char c, int n).
*/
public class Swaping_parameter_7th {
	// Scanner sc=new Scanner(System.in);
	static int a;
	static char b;

	void Swap(int a, char b) {

		System.out.println("method 1:-Intger is=" + a + "\nCharacter is=" + b);

	}

	void Swap(char b, int a) {

		System.out.println("Method 2:-Character is=" + b + " \n Integer is=" + a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter integer");
		a = sc.nextInt();
		System.out.println("Enter character");
		b = sc.next().charAt(0);
		Swaping_parameter_7th ob = new Swaping_parameter_7th();
		ob.Swap(a, b);
		ob.Swap(b, a);

	}

}
