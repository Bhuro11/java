//Thread Joins 

public class ThreadJoin {
 public static void main(String[] args) {
	 try {
		 System.out.println("Start of main");
		 MyThread1 mt1 = new MyThread1();
		 MyThread2 mt2 = new MyThread2();
		 mt1.start();
		 mt1.join();
		 mt2.start();
		 mt2.join();
		 System.out.println("End of main");
	 }
	 catch(Exception e){}
 }

}
class MyThread1 extends Thread{
 public void run(){
	 for(int i=1;i<=10;i++) {
		System.out.println("MyThread-1."+i);
		try {
		sleep(100);
		}
		catch(Exception e){ }
	 }
 }
}
class MyThread2 extends Thread{
 public void run(){
	 for(int i=1;i<=10;i++) {
		 System.out.println("MyThread-2."+i);
		 try {
		 sleep(200);
		 }catch(Exception e){ }
	 }
 }
}
