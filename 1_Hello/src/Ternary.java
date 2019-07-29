
public class Ternary {

	public static void main(String[] args) {
		Object obj1;
		Object obj2;
		
		if(true) {
			obj1=new Integer(10);
		}
		else {
			obj1=new Double(12.5);
		}
		System.out.println(obj1);
		obj2=true?new Integer(10):new Double(12.5);
		System.out.println(obj2);
		}

}
