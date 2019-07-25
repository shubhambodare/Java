import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		int Arra[]=new int[5];
		
		ArrayList<Integer> My_List=new ArrayList<Integer>(5);
		My_List.add(1);
		My_List.add(9);
		My_List.add(6);
		My_List.add(8);
		My_List.add(4);
		
		for(Integer X : My_List)
			System.out.println(X);
		

	}

}
