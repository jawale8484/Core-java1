package com.hefshine.collection.Set;
import java.util.Iterator;
//1.	WAP to iterate through all elements in a TreeSet.
import java.util.TreeSet;

public class Iterate_Treeset_1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts=new TreeSet();
ts.add("A");
ts.add("B");
ts.add("C");
ts.add("D");
ts.add("E");
ts.add("F");

//System.out.println(ts);

Iterator itr=ts.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next()+" ");
}
	}

}
