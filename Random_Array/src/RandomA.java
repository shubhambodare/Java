import java.util.Random;

public class RandomA {

	public static void main(String[] args) {
		Random r=new Random();
		
		int ar[]=new int[10];
		
		for(int i=0;i<ar.length;i++) {
			
			ar[i]=r.nextInt(100);
		}
		
		for(int l:ar) {
			
			System.out.println(l);
		}
		
	} 

}
