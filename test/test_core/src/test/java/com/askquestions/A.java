package com.askquestions;

 class A {
	static {
	System.out.println("am in static block a");	
	}
	{
		System.out.println("am in normal block a");	
	}

	A()
	{
		System.out.println("am in constructor block a");	
	}
}
