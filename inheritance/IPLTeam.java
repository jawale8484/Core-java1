package com.hef.inheritance;
//5.Create class IPLTeam with method play (). 
//Create child classes of IPLTeam called as CSK, RCB. In main, call play () from child class objects.


class Csk extends IPLTeam{
	
}
class Rcb extends IPLTeam{
	
	
}
public class IPLTeam {

	void play() {
		System.out.println("Team play for organization");
	}



public static void main(String[] args) {
		// TODO Auto-generated method stub
Csk ob=new Csk();
ob.play();
Rcb ob1=new Rcb();
ob1.play();
	
	}

}