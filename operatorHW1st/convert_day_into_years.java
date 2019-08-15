package operatorHW1st;

public class convert_day_into_years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int ip,year;
ip=373;
	year=ip/365;
System.out.println("years of given days:- "+year);
int temp1=ip%365;
int week=temp1/7;
int day=week/1;
System.out.println("weeks for remaining days are:- "+week);
System.out.println("remaining days:- "+day);
	}

}

