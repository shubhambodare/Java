
class A extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("hi");
		try {Thread.sleep(1000);}
		catch (Exception e) {}
		}
	}
}

class B extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("hello");
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}
}



public class FirstThread {

	public static void main(String[] args) throws Exception {
		
		A obj1=new A();
		B obj2=new B();
		
		obj1.start();
		obj2.start();
		Thread.sleep(10);
		

	}

}
