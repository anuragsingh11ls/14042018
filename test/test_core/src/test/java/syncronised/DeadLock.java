package syncronised;

public class DeadLock {

	/**
	 * @param args
	 */
	public void method1() {
		synchronized (String.class) { 
			System.out.println("Aquired lock on String.class object"); 
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object"); 
				}
			}
		} 
	public void method2() {
		synchronized (Integer.class) { 
			System.out.println("Aquired lock on Integer.class object"); 
			synchronized (String.class) { 
				System.out.println("Aquired lock on String.class object");
				}
			}
		}
	public static void main(String[] args) {
		DeadLock d=new DeadLock();
		d.method1();
		d.method2();
		System.out.println("aaaaaaa");
	}

}
