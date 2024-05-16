package com.coreconcepts.accessmodifiers;

public class PublicA {
	
	public void display() {
		System.out.println("TNS Sessions");
	}

}
package com.coreconcepts.accessmodifiers1;

import com.coreconcepts.accessmodifiers.PublicA;

public class Public3Main {
	
	public static void main(String[] args) {
		
		PublicA p3 = new PublicA();
		p3.display();
		
	}

}
