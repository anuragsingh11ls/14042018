package test.core;

public class FanallyTest {

	/**
	 * @param args
	 */
	static int i;
	public static void main(String[] args) {
		try{
			int i=9/7;
			System.out.println("am in try-===");
			 //System.exit(0);
			return ;
		}catch (Exception e) {
			 System.exit(0);
			System.out.println("am in catch");
		}finally{
			System.out.println("am in finally");
		}
		System.out.println("hhhhhhhhh");

	}

}
