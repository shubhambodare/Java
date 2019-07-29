
class Parent{
	
	  void Show() {
		
		System.out.println("Parent show");
		
	}
	
}

class Child extends Parent{
	
	void Show() {
		
		
		System.out.println("Child show");
		
	}
	
}

public class Override {

	public static void main(String[] args) {
		
		Parent obj=new Child();
		
		obj.Show();
		
	}

}
