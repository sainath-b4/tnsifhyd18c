package com.coreconcepts.abstractclass;

public abstract class Person {
	
	public void speak() {
		System.out.println("Share his/her thougths");
	}
	
	public abstract void eat();

}
public class Nonveg extends Person {
	

	@Override
	public void eat() {
		System.out.println("Eats Nonveg");
	}

}
public class Veg extends Person{
	
	@Override
	public void eat() {
		System.out.println("Eats veg");
	}

}
public class MainAbstract {
	
	public static void main(String[] args) {
		Person john = new Veg();
		john.speak();
		john.eat();
		System.out.println("=======================");
		Person mia = new Nonveg();
		mia.speak();
		mia.eat();
	}

}
