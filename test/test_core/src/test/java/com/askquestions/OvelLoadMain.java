package com.askquestions;

public class OvelLoadMain {

	/*public static void main(String args[]) {
		System.out.println("aaaaaaaaa");
	}*/
	static void display(int... valuess){  
		  System.out.println("display method invoked ");  
		 }  
	
	static void display1(int num, String... values){  
		  System.out.println("number is "+num);  
		  for(String s:values){  
		   System.out.println(s);  
		  }  
	}
	public static void main(String... args) {
		display();
		display(1,2,3);
		System.out.println("bbbbb");
	}

	//public static void main(String ... ar[] ){System.out.println("main with String");}  
	public static void main(){System.out.println("main without args");} 
}
