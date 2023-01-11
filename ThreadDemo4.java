//Thread Priorates
public class ThreadDemo4 {
 public static void main(String[] args) {
	 System.out.println("Start main");
	 MyThread mt = new MyThread();
	 Thread t1 = new Thread(mt,"Thread-1");
	 Thread t2 = new Thread(mt,"Thread-2");
	 t1.start();
	 t2.start();
	 t2.setPriority(t1.getPriority()+5);
	 System.out.println("End main");
 }

} 
class MyThread implements Runnable {
 public void run() {
	 for(int i = 1;i<=10;i++) {
		System.out.println(Thread.currentThread().getName());
	 }
 }
}