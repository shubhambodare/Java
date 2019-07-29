
public class Series {

	public static void main(String[] args) {
		
		int first=0,second=1,temp=0;
		
		System.out.print(" "+first+" "+second);
		
		while(temp<=60) {
			
			temp=first+second;
			if(temp>60)
				break;
			System.out.print(" "+temp);
			first=second;
			second=temp;
		}
	}
}
