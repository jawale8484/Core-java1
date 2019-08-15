package com.hefshine.ExceptionHandling;

public class OverrideFinalize {
	//String s=null;
	protected void finalize() {
		System.out.println("called");
		//System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverrideFinalize ob=new OverrideFinalize();
OverrideFinalize ob1=new OverrideFinalize();
//ob =null;
//ob1=null;
//ob.finalize();
//System.gc();
//System.gc();
//System.out.println("gc called");
Runtime.getRuntime().runFinalization();
//Runtime.runFinalizersOnExit(true);


//OverrideFinalize ob1=new OverrideFinalize();




	
	
	}

}
