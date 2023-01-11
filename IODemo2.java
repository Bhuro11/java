//Bytestream Class to read file
import java.io.*;
public class IODemo2 {
	 public static void main(String[] args) {
	 System.out.println("Content of abc.txt file:\n");
	 try{
	 FileInputStream fin = new FileInputStream("abc.txt");
	 int c;

	 while((c=fin.read())!= -1 ){
		System.out.print((char)c);
	}
	}catch(Exception e) { }
	}
}