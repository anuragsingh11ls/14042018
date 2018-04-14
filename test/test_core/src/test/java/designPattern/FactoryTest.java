package designPattern;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystemFactory factory=new OperatingSystemFactory();
		//factory.GetInstance("open");
		
		Os o=factory.GetInstance("open");
		o.spec();
	}

}
