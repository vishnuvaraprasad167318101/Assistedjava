package iostream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fo=new FileWriter("input",true);
		if(fo!=null) {
			System.out.println("file created and opened in write mode");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input for the file ");
		//sc.next(),sc.nextLine()
		String fileinput=sc.nextLine();
		//convert char into  bytes
		//byte b[]=fileinput.getBytes();
		fo.write(fileinput);
		System.out.println("write operation completed");
		fo.close();
		
	}

}


