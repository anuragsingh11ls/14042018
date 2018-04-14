package com.askquestions;

public class TestStatic extends A{

	/**
	 * @param args
	 */
	
	static {
		System.out.println("am in static block TestStatica");	
		}
		{
			System.out.println("am in normal block TestStatica");	
		}

		TestStatic()
		{
			System.out.println("am in constructor block TestStatica");	
		}
	
	public static void main(String[] args) {
		System.out.println("inside main");

		//A a=new A();
		TestStatic TestStatic=new TestStatic();
	}
	

	
}
