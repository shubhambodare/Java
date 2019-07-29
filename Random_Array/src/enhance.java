import java.util.Random;

public class enhance {

	public static void main(String[] args) {

		Random r=new Random();
		
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=r.nextInt(100);
		}
		
		for(int l:arr) {
			System.out.println(l);
		}

	}

}
