package bharti;



public class sleepthread extends Thread  {
	
	
public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args)
{
	 sleepthread t1=new  sleepthread();
	 sleepthread t2=new  sleepthread();
	
	 t1.setName("Thread-1");
	 t2.setName("Thread-2");
     t1.start();
     t1.getName();
	 t1.run();
	 try {
         Thread.sleep(1000); 
     } catch (InterruptedException e) {
         System.out.println(e);
     }
 
}
 
}
 
 