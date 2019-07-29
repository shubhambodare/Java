
public class Varargs {

	public static void main(String[] args) {
		
		a obj=new a();
		
		obj.show(5,6,7,8);	

	}
	
}

class a{
	
	void show(int ...a) {
		for(int i=0;i<a.length;i++) {
			
			System.out.print(+a[i]);
		}
		
		for(int l:a)
		     System.out.println(l);
	}
}
