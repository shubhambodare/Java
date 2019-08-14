
class s{
	    
	int i=7;
	static int b;
	static void show() {
		
		System.out.println("hii "+b);
	}
	
	void read() {
		System.out.println("hero "+i);
	}
	void print() {
		
		System.out.println("both "+b+" and "+i);
	}
	static void give() {
		System.out.println("gives "+b);
	}
}
public class sts {
		
	public static void main(String[] args) {
	s.b=5;
	s.show();
	s obj=new s();
	obj.read();
	s.give();
	obj.print();
	}

}
