package com.askquestions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArraylistTest {
	  final static double salary;
	  
	  static				          // static block
	  {
	    salary = 9999.99;
	  }

	 static public void main(String... args) {
		// TODO Auto-generated method stub
		
		 
		 ArrayList l=new ArrayList();
		 l.add("a");
		 l.add(10);
		 l.add("a");
		 l.add(null);
		 System.out.println(l);
		 l.remove(2);
		 l.add(2, "m");
		 l.add(2, "o");
		 l.add("n");
		 //l.removeAll(l);
		 System.out.println(l);
		 int oldCapacity=16;
		 
		 
		
		 int newCapacity = (oldCapacity * 3)/2 + 1;
		System.out.println(salary);
		
		
		 ArrayList l1=new ArrayList();
		 LinkedList l2=new LinkedList();
		 System.out.println(l1 instanceof Serializable);
		 System.out.println(l2 instanceof Serializable);
		 System.out.println(l1 instanceof RandomAccess);
		 System.out.println(l2 instanceof RandomAccess);
		 
		int [] a= new int[]{1,2,3,4};
		int [] b= new int[3];
		
		System.out.println(b.length);
		/*ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.remove(0);
		a.add(1);
		
		for (Object object : a) {
			System.out.println(object);
		}*/
	}

}
