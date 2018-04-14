package defaul;
import java.util.ArrayList;
import java.util.List;

public class ArraylistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List l=new ArrayList();
		//l=new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add(1);
		
		for (Object object : l) {
			System.out.println("object"+object);
		}
		
		
	}

}
