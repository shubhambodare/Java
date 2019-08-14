import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		
		String a;
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextLine();
		
		int n=a.length();
		
		String b="";
		
		for(int i=n-1;i>=0;i--) {
			
				b=b+a.charAt(i);
		}
		
		System.out.print(b);

	}

}
