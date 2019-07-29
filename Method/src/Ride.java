
class A{
	
	int add(int a,int b) {
		
		return (a+b);
		
	}
	
	double add(double a,double b) {
		
		
		return (a+b);
	}
	
}
public class Ride {

	public static void main(String[] args) {
		
		A name=new A();
		
		System.out.println(name.add(10.23, 25.24));
		System.out.println(name.add(5, 4));

	}

}
