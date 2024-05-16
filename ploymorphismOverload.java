package com.oop4.polymorphism;

public class PolymorphismMOverload {
	
	// method without parameter
	  public void display() {
	    for (int i = 0; i < 10; i++) {
	      System.out.print("*");
	    }
	  }

	  // method with single parameter
	  public void display(char symbol) {
	    for (int i = 0; i < 10; i++) {
	      System.out.print(symbol);
	    }
	  }

}
public class PolymorphismMOverloadMain {
	
	public static void main(String[] args) {
		PolymorphismMOverload m1 = new PolymorphismMOverload();
		m1.display();
		
		System.out.println("\n");
		
		m1.display('#');
	}

}

