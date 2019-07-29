import java.util.Scanner;

public class First {  

   static void countEachChar(String a) 
   { 
	
	int counter[] = new int[256]; 

	
	int len = a.length(); 

	
	for (int i = 0; i < len; i++) 
		counter[a.charAt(i)]++; 

	
	char array[] = new char[a.length()]; 
        for (int i = 0; i < len; i++) { 
	   array[i] = a.charAt(i); 
	   int flag = 0; 
	   for (int j = 0; j <= i; j++) { 

		
		if (a.charAt(i) == array[j])  
			flag++;                 
	   } 

	   if (flag == 1)  
	      System.out.print("" + a.charAt(i)
		 + "" + counter[a.charAt(i)]);             
	} 
   } 
   public static void main(String[] args) 
   {  
	 String a;
	Scanner sc =new Scanner(System.in);
	a=sc.nextLine();
	countEachChar(a);
   } 
}
