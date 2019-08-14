interface e{
	
	void show();
}

class s implements e{
	
	public void show() {
		
		System.out.println("showing..");
	}
}
public class Nope {

	public static void main(String[] args) {
		s ob=new s();
		ob.show();

	}

}
