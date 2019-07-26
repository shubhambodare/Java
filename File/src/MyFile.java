import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFile {

	public static void main(String[] args) {
		
		File file =new File("First.txt");
		
		if(!file.exists()) {
			try {{
				file.createNewFile();
			}
				PrintWriter pw=new PrintWriter(file);
				pw.println("hii it's me...");
				pw.close();
				System.out.println("Done");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
			
		
	}

}
