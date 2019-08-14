
class A{
	
	void show() {
		
		System.out.println("hi");
	}
}

class B extends A{
	
	void show() {
		super.show();
		System.out.println("bye");
	}
}

public class lavender {

	
	public static void main(String[] args) {
		
		B obj =new B();
		obj.show();

	}

}
