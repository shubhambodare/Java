
public class Loot {

	public static void main(String[] args) {
		AB obj=new AB(6);
obj.show();
	}

}

class AB{
	private int x;
	AB(int x){
		
	this.x=x;
	}
	
	void show() {
		System.out.println(x);
	}
}