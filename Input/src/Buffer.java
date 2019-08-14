import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Buffer{
	
	public static void main(String args[]) throws Exception {
	
		InputStreamReader is=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("Enter Number");
		
		int a=Integer.parseInt(br.readLine());
		
		System.out.println(a);
	}
	
	
	
}