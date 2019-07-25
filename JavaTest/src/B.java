
public interface B {
	
	default int show() {
		System.out.println("class B");
		return 0;
	}

}

class C implements B{
	
	int read() {
		
		System.out.println("class C from B interfec");
		
		return 0;
	}
	
}