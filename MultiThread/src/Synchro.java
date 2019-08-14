
class incr{
	
	int count;
	
	public void increment() {
		
		count++;
	}
}


public class Synchro {

	public static void main(String[] args) throws Throwable {
		incr c=new incr();
		
		Thread t1=new Thread(new Runnable() {
				
				public void run() {
			
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
				}
				});
		t1.start();
		t1.join();
		System.out.println("count"+c.count);
	}

}
