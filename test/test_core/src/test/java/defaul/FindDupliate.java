package defaul;
import java.util.HashSet;

public class FindDupliate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		int[] i={1,2,3,4,5,6,7,8,9,9,8,5};
		 
        HashSet<String> set = new HashSet<String>();
        HashSet<String> s=new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
        
       /* for(int a:i)
        {
        	if(!s.add(a))
        	{
        		System.out.println("Duplicate Element is : "+s);
        	}
        }*/
	}

}
