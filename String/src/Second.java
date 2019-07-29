import java.util.Scanner;


public class Second {
	
	
	 static void show(String a) {
		 
		 int[] count=new int[256];
		 
		 int len=a.length();
		 
		 for(int i=0;i<len;i++) {
			 
			 count[a.charAt(i)]++;
			 
		 }
		
		 char[] arr=new char[a.length()];
		 
		 for(int i=0;i<len;i++) {
			 
			 arr[i]=a.charAt(i);
		 
		 int flag=0;
		 for(int j=0;j<=i;j++) {
			 
			 if(a.charAt(i)==arr[j]) {
				 flag++;
			 }
		 }
			 if(flag==1) {
			 System.out.print(""+a.charAt(i)+""+count[a.charAt(i)]);
			 }	
	}
	 }

	public static void main(String[] args) {
		String a;
		
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextLine();
		
		show(a);
	}

}
