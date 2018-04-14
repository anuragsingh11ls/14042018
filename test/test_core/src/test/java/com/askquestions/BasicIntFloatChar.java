package com.askquestions;

public class BasicIntFloatChar {
	
	void play()
	{
		String s=null;
	}

	public static void main(String[] args) {
		int i=1;
		//float f=1.0f;
		Double d=1.0d;
		//char c='a';
		//long l=1;
		String s1=String.valueOf(i);
		System.out.println(s1);
		String s="anurag";
		String name="anurag";
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		char[] stringArray = {'a','b','c','d'};
		
		String as=new String(stringArray);
		
		System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1));
		
		System.out.println(as.toUpperCase());
		

	}

}
