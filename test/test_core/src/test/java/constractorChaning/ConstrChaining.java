package constractorChaning;
class A{
 A(){
  System.out.println("In class A's constructor");
 }
public void m(){
	System.out.println("-aaaaaaaaaaaa---");
}
}

class B extends A{
 B(){
  System.out.println("In class B's constructor");
 }
 public void m(){
		System.out.println("-bbbbbbbbbbbbb---");
	}
}
class C extends B{
 C(){
	 
  //super();
  System.out.println("In class C's constructor");
 }
 public void m(){
		System.out.println("---cccccccccccc--");
	}
}
public class ConstrChaining {

 /**
  * @param args
  */
 public static void main(String[] args) {
  C c = new C();
  B b=new C();
  A a=new B();
  c.m();
  b.m();
  

 }

}