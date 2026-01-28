package bharti;

public class Mythreads  extends Thread
{
public void run()
	{
		System.out.println("Thread is running");
	}
public static void main(String[] args)
{
Mythreads t= new Mythreads();
t.start();
t.run();
//t.sleep(1111);
}
}
