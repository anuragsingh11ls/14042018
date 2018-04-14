package test.core;

public class StringNull {

	/**
	 * @param args
	 */
	public Object print(Object o)
	{
		System.out.println("object");
		return null;
	}
	public void print(String s)
	{
		System.out.println("string");
		//return null;
	}
	
	public void print(int i)
	{
		System.out.println("int");
		//return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringNull s = new StringNull();
		s.print(s);
		
		

	}

}
