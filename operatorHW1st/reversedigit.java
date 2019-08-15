package operatorHW1st;
				
public class reversedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1234;
		int b = a % 10;
		a = a / 10;
		b = b * 10;
		int c = a % 10;
		c = b + c;
		a = a / 10;
		c = c * 10;
		int d = a % 10;
		d = d + c;
		d = d * 10;
		a = a / 10;
		int e = a % 10;
		e = e + d;

		System.out.println(e);
	}

}
