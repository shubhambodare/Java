package palindrome;

public class pali {

	public static void main(String[] args) {
		
		int n=121,rem,str=0,temp;
		
		temp=n;
		while(n>0) {
			
			rem=n%10;//3,2,1
			n=n/10;//12,1,0
			str=str*10+rem;	//0*10+3=3,3*10+2=32,32*10+1=321
		}
		
System.out.println(str);
if(temp==str) {
	System.out.println("pali");
}
else {
	System.out.println("not pali");
}
		
		

	}

}
