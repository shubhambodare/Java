import java.io.*;

public class Demo {

	public static void main(String[] args) throws Exception
	{
		
		File f=new File("File.txt");
		
		FileOutputStream Fi=new FileOutputStream(f);//Taking File
		DataOutputStream di=new DataOutputStream(Fi);
		di.writeUTF("Hi shubahm");
		
		FileInputStream Fo=new FileInputStream(f);//Reading File
		DataInputStream Do=new DataInputStream(Fo);
		String str=Do.readUTF();
		System.out.println(str);

	}

}
