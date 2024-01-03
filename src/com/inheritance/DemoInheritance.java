package com.inheritance;

//----------------Single Level Inheritance-------------		1 Base Class====1 Derived Class
class Animal{
	public void animSound() {
		System.out.println("Animals sounds are :");
	}
}
class Dog extends Animal{
	public void animSound() {
		System.out.println("Dog says : bow bow...");
	}
}
/*//-----------------Multi-Level Inheritance----------------	1 Base Class====1 Derived Class====Another Derived Class
class Cat extends Dog{															
	public void animSound() {
		System.out.println("Cat says : mew mew...");
	}
}
*/
 
//----------------hierarchical Inheritance----------------	1 Base Class====Multiple Derived Classes
class Tiger extends Animal{
	public void animSound() {
		System.out.println("Tiger : roar...");
	}
}

//---------------Hybrid Inheritance-----------------------	

	
public class DemoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.animSound();
		Animal d = new Dog();
		d.animSound();
		//Cat c = new Cat();
		//c.animSound();
		Animal t = new Tiger();
		t.animSound();
		
	}

}
