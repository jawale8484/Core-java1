package operatorHW1st;

public class Compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double princi,rate,time,n;    
		princi=20000;
		rate=7.12;
		time=2;
		n=2;
		double temp=Math.pow(1+rate/n, n*time);
		double amount=princi*temp;
		 double interest=amount-princi;
System.out.println(interest);
System.out.println(temp);
	}

}
