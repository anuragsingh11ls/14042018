package com.askquestions;

public class Overoading {

/*	public int m() {
		return 0;
	}
	public char m() {
		return 0;
	}
	public long m() {
		return 0;
	}*/
	
	int add(int a,int b)
	{
		return b;
		
	}
	 float add(float a,int b)
	 {
		return b;
		 
	 }
	 float add(int a ,float b){
		return b;
		 
	 }
	 void add(float a)
	 {
		 
	 }
	 /*int add(int a)
	 {
		 
	 }
	 void add(int a)
	 {
		 
	 }*/
}
