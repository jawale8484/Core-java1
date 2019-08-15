package controlstmt_HW2nd;

import java.util.Scanner;

public class gross_salary_11th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("ENter basic salary");
double HRAresult=0;
double DAresult=0;
int b_salary=sc.nextInt();

if (b_salary<=10000) {
	
	HRAresult=b_salary*0.20;
	DAresult=b_salary*0.80;
}else if (b_salary<=2000)
{
	HRAresult=b_salary*0.25;
	DAresult=b_salary*0.90;
}	
	
else if(b_salary>2000) {
	HRAresult=b_salary*0.30;
	DAresult=b_salary*0.95;
	
	}	
System.out.println("HRA"+HRAresult);
System.out.println("DAresult"+DAresult);

	}

}
