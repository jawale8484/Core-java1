package operatorHW1st;

public class result_of_5_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1, sub2, sub3, sub4, sub5;
		sub1 = 70;
		sub2 = 78;
		sub3 = 88;
		sub4 = 76;
		sub5 = 89;
		int ob_marks = sub1 + sub2 + sub3 + sub4 + sub5; // total marks
		double average = ob_marks / 5; // average
		float percentage = (ob_marks * 100 / 500);
		System.out.println("Total marks of 5 subjects is:- " + ob_marks);
		System.out.println("Average of 5 subjects is:- " + average);
		System.out.println("percentage of 5 subject is:- " + percentage);

	}

}
