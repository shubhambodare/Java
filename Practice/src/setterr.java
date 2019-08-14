
class Latest{
	
	private int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	private String s="shubahm";
	
}
public class setterr {

	public static void main(String[] args) {
		Latest obj=new Latest();
		obj.setN(1);
		System.out.println(obj.getN());
		obj.setS("shubham");
		System.out.println(obj.getS());

	}

}
