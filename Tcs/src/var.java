
class A{
	static int i;
	A() {
		
		i++;
	}
	
	void print() {
		System.out.println(i);
	}
	
}
public class var {

	public static void main(String[] args) {
		
		A obj=new A();
		A obj2=new A();
		A obj3 =new A();
		A obj4 =new A();
		
		obj.print();
		
	}

}
