package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestGeneric {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		Animal b=new Dog();
		Dog d=new Dog();
		a.move();
		b.move();
		d.bark();
		d.move();
		
		List<Animal> list = new ArrayList<Animal>();
		
		
		list.add(new Dog());
		list.add(new Cat());
		
		List<? extends Animal> list1 = new ArrayList<Dog>();
		//list1.add(new Cat());
		List<? extends Animal> list2 = new ArrayList<Cat>();
		//List<Anumal> l=new ArrayList<Anumal>();
		
		//l.add(Cat);
	}

}
