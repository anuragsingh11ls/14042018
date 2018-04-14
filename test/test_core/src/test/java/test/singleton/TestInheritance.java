package test.singleton;

public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a=new B();
		A b=new B();
		
		B b1=new B();
		B b2 = (B) new A();
		a.setfName("anurag");
		b.setfName("anurag");
		
		
		String s="anurag";
		String s1="anurag";
		
		System.out.println("sssssssss"+s.hashCode());
		System.out.println("ss2222222"+s1.hashCode());
		System.out.println("eeeeee"+s.equals(s1));
		System.out.println("====="+s==s1);
		
		System.out.println("kkkkkkkkkk"+a.equals(b));
		System.out.println(b.hashCode());

	}

}
