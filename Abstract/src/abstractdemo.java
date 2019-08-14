
public class abstractdemo {

	public static void main(String[] args) {
		
		A obj=new C();
		obj.read();
		obj.move();
		obj.show();
	}

}

abstract class A{
	
	public void show() {
		System.out.println("showing...");
	}
	public abstract void read();
	public abstract void move();
	
}

abstract class B extends A{
	
	public void read() {
		System.out.println("reading...");
	}
}

class C extends B{
	
	public void move() {
		
		System.out.println("Moving");
	}
	
}