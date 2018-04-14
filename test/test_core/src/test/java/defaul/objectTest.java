package defaul;
import java.util.HashMap;


public class objectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	int t[]={1,2,3,4,5,6,7,8,9};
		for (int i = 0;  i< 9; i++) {
			System.out.println(t[i]);
			
		}*/
		// TODO Auto-generated method stub
		Object o1=new Object();
		Object o2=new Object();
		System.out.println(o1.equals(o2));
		System.out.println(o1==o2);
		String s1="anurag";
		String s2=new String(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1 ==s2);
		

	}

}
