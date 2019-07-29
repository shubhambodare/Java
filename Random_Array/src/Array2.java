
public class Array2 {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		int i;
		
		for(i=0;i<a.length;i++) {
			
			a[i]=i*2;
		}
		
		for(int i1 : a) {
			System.out.println(i1);
		}
		
	}

}
