package test.singleton;
 
import java.util.HashSet;
import java.util.Set;
 
public class TestInteger 
{
    public static void main(String[] args) 
    {
    	int i1=1;
    	double d=1d;
    	float f=1.2f;
    	char c='c';
    	String s="asdf";
    	
    	System.out.println(+i1);
    	System.out.println(+d);
    	System.out.println(+f);
    	System.out.println(""+c);
    	
    	
    	
        int[] array = {1,1,2,2,3,4,5,-5,6,7,-8,8};
         
        Set<Integer> set = new HashSet<Integer>();
         
        for(int i = 0; i < array.length ; i++) 
        {
            //If same integer is already present then add method will return FALSE 
            if(set.add(array[i]) == false) 
            {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }
    }
}
 
