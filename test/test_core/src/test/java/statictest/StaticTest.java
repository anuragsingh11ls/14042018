package statictest;

public class StaticTest {

	static{
		int i=10;
	}
	static int j;
	int k=30;
	public static void main(String[] args) {

		//j=10;
		System.out.println(j++);
	}

}
