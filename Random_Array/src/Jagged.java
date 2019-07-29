
public class Jagged {

	public static void main(String[] args) {
		int p[][]= {{5,6,7,8},//           |
			       {6,7},// ---->i    |
			       {9,8,7}};

		for(int l[]:p) {
			
			for(int m:l) {
				
				System.out.print(m+" ");
			}
			System.out.println(" ");
		}
	}

}
