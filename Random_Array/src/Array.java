
public class Array {

	public static void main(String[] args) {
		
		int arr[]=new int[50];
		int n=10,i;
		
		for(i=2;i<n;i++) {
			
			arr[i]=i*2;
				
		}
			
		for(i=2;i<n;i++) {
			if(arr[i]==12)
				//break;//4 6 8 10 
				continue;//4 6 8 10 14 16 18
		System.out.println(arr[i]);
		}

	}

}
