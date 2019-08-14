class Printer{
	
	public void print(Paper p) {
		p.settext("new values");
	}
}
class Paper{
	String text;
	
	public void settext(String t) {
		text=t;
	}
	public String gettext() {
		
		return text;
	}
	
}

class Pro{
	
	public static void main(String[] args) {
		
		Paper p=new Paper();
		p.settext("hi it's me");
		System.out.println(p.gettext());
		Printer hp=new Printer();
		hp.print(p);
		System.out.println(p.gettext());
	}
}