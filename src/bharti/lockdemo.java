package bharti;
import java.util.*;

public class lockdemo {
	private int n;
	private int number =1;
	private final Object lock = new Object();
	public lockdemo(int n) {
		this.n=n;
		Runnable task = () ->{
			while(true) {
				synchronized(lock) {
					if(number>n) {
						lock.notifyAll();
						break;
					}
					System.out.println(number+" ");
					number++;
					lock.notifyAll();
					try {
						lock.wait();
					}catch(InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
		};
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		new lockdemo(n);
		sc.close();
		

	}

}
