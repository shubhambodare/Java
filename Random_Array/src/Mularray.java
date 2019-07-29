
public class Mularray {

	public static void main(String[] args) {
		
		//int a,b,c,d;
		
		//int arr1[]= {5,6,7,8};
		//int arr2[]= {6,7,8,9};
		//int arr3[]= {9,8,7,6};
		
		int p[][]= {{5,6,7,8},//           |
				    {6,7,8,9},// ---->i    |
				    {9,8,7,6}};//          j
		
		for(int i=0;i<p.length;i++) {
			
			for(int j=0;j<p.length+1;j++) {
				
				System.out.print(+p[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
