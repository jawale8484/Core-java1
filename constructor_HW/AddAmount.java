package comp.hef.constructor_HW;
/*6.	Suppose you have a Piggy Bank with an initial amount of $50 and you have to add some more amounts to it.
 *  Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. 
 *  Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank
*/

public class AddAmount {
int amount=50;

public AddAmount() {
	// TODO Auto-generated constructor stub
System.out.println("no amount will be added to the Piggie Bank");
}
AddAmount(int deposit){
	//constructor
	int famount=deposit+amount;
	
	System.out.println(famount);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddAmount ob=new AddAmount();
AddAmount ob1=new AddAmount(50);
	}

}
