package StringTest;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="<message><messageHeader></messageHeader></message>";
		String t="bsafpi>";
		
		String result = s.replace("message>", t);
		
	
		System.out.println(result);
	}

}
