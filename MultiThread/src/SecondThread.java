
class First implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			
			System.out.println("hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Second implements Runnable{
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
}
public class SecondThread {

	public static void main(String[] args) throws Exception {
		
		Runnable obj1=new First();
		Runnable obj2=new Second();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		Thread.sleep(10);
		t2.start();

	}

}
