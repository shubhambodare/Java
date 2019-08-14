class s{
	private int i;
	
	public void setShow(int j) {
		
		i=j;
	}
	
		int getShow() {
			System.out.println(i);
			return 0;
		}
	
}
public class Encap {

	public static void main(String[] args) {
		s obj=new s();
		obj.setShow(5);
		obj.getShow();
		//System.out.println(obj.getShow());

	}

}
