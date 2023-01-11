//File Class 
import java.io.*;
public class IODemo1 {
 public static void main(String[] args) {

	 try 
	 {
		 File f = new File("abc.txt");
		 if(f.createNewFile()) {
			System.out.println("File Sucessfully created");
		 }
		 else 
		 {
			System.out.println("File already exist");
		 }
			 System.out.println("File name : "+f.getName());
			 System.out.println("Path: "+f.getPath());
			 System.out.println("Absolute path: " +f.getAbsolutePath());
			 System.out.println("Parent: "+f.getParent());
			 System.out.println("Exists : "+f.exists());
			 System.out.println("Is writeable: "+f.canWrite());
			 System.out.println("Is readable: "+f.canRead());
			 System.out.println("Is a directory: "+f.isDirectory());
			 System.out.println("File Size in bytes: "+f.length());
	 }catch(Exception e){
		System.out.println(e);
	 }
 }
}