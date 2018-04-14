package test.singleton;

import java.sql.SQLException;

public class SingletonTest {

	public static void main(String[] args) throws Exception {
		
		
	
				
		Singleton t1= Singleton.create();
		Singleton t2= Singleton.create();
		Singleton t3= Singleton.create();
				
	
				if((t1==t2)&&(t2==t3)&&(t3==t1))
				{
					System.out.println("All Created Object are Same");
				}
				else
				{
					System.out.println("All Created  Object are not Same");
				}
			}

}
