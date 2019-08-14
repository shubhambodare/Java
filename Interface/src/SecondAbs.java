interface A{
	
	void show();
}

interface B{
	
	void show();
}

class C implements A,B{      //Multiple Inheritance in Interface
	
	public void show() {
		
		System.out.println("hii....");
	}
}
public class SecondAbs {

	public static void main(String[] args) {
	
		C obj=new C();
		obj.show();

	}

}
