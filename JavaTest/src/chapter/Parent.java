package chapter;

abstract class A{
	int first() {
		
		System.out.println("First class");
		
		return 0;
	}
}

class B extends A{
	
	int second() {
		
		System.out.println("Second class");

		
		return 0;
	}
}


public class Parent {

	public static void main(String[] args) {
		
		B obj=new B();
		C ob=new C();
	
		obj.first();
		obj.second();
		ob.show();
	}

}

