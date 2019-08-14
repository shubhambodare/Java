import java.util.Scanner;

public class Number {
	
	 static int rev(String s) {
		 
		 int counter[]=new int[256];
		 
		 int len=s.length();
		 
		 int i;
		 
		 for(i=0;i<len;i++) {
			 
			 counter[s.charAt(i)]++;
		 }
		 
		 char arr[]=new char[s.length()];
		 
		 for(i=0;i<len;i++) {
			 arr[i]=s.charAt(i);
			 
			 int flag=0;
			 for(int j=0;j<=i;j++) {
				 
				 if(s.charAt(i)==arr[j])
					 
					 flag++;
			 }
			 if(flag==1) {
				 System.out.print(""+s.charAt(i)+""+counter[s.charAt(i)]);
			 }
		 }
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s;
		
		s=sc.nextLine();
		rev(s);
	}

}
