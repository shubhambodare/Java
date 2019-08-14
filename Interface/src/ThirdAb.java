interface First{
	
	default void show() {
		//to define method in interface use default keyword
		System.out.println("in First Default");
	}
}

class Second{
	
	public void show() {
		
		System.out.println("in class second");
	}
}

class Third extends Second implements First{ 
	
	//In extends and implements first priorites given to class
}
public class ThirdAb {

	public static void main(String[] args) {
	
		Third obj=new Third();
		obj.show();

	}

}
