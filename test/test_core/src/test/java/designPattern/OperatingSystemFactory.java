package designPattern;

public class OperatingSystemFactory {

	public Os GetInstance(String str)
	{
		if(str.equals("open"))
		{
			return new Android();
		}
		else if(str.equals("closed"))
		{
			return new Ios();
		}
		return new Windows();
		
	}
}
