//Bytestream Class to create file
import java.io.*;
public class IODemo3 {
 public static void main(String[] args) {
	 try{
		 //DataInputStream out = new DataInputStream(System.in);
		 BufferedInputStream out = new BufferedInputStream(System.in);
		 FileOutputStream fout = new FileOutputStream("abc.txt");
		 System.out.println("Enter text (enter & to end): &");
		 int ch;
		 while ((ch = (char) out.read()) != '&')
		 fout.write((char)ch);
		 fout.close();
	 }catch(Exception e){}
 }
}