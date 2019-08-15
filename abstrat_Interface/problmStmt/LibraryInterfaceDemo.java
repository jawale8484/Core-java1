package com.hef.abstrat_Interface.problmStmt;

import java.util.Scanner;

/*
Test case #1:
•	Create an instance of KidUser class. 
•	Set the age as specified in the below table and invoke the registerAccount method  of the  KidUser object
Age
10
18
•	Set the book Type as specified in the below table and invoke the requestBook method of the KidUser object,
BookType
“Kids”
“Fiction”

*/

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidsUser ob_kid = new KidsUser();
		
		ob_kid.RegisterAccount(10);
		ob_kid.RequestBook("Kids");
		
		
		AdultUser ob_Adlt = new AdultUser();
		
		
		ob_Adlt.RegisterAccount(18);
		ob_Adlt.RequestBook("Fiction");

	}

}
