package test.singleton;

import java.sql.SQLException;

public class Singleton {
	
	//private static Singleton t ;//leazy initilization
	private static Singleton t =null;
	//private static Singleton t =new Singleton();//Eager initilisation
	private Singleton()
	{
		System.out.println("Object Created at First Time");
	}
	 //static block initialization for exception handling
    static{
        try{
            t = new Singleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
	
	public static synchronized  Singleton create() throws SQLException
	{
		if(t==null)
		{
			t=new Singleton();
		}
		else
		{
			System.out.println("Object Already Created "+t);
		}

		return  t;
	}
    }



	