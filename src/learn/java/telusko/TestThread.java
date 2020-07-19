package learn.java.telusko;





public class TestThread {

	public static void main(String[] args) throws Exception {
	Thread t1=new Thread(() ->  {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi..."+Thread.currentThread().getPriority());
			try {Thread.sleep(1000);} catch(Exception e) {}
			
		}
	});
	Thread t2=new Thread(() ->   {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello..."+Thread.currentThread().getPriority());
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	});
	
	t1.setPriority(1);
	t2.setPriority(10);
	
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	
	
	
	t1.start();
    try {Thread.sleep(1000);} catch(Exception e) {}
	t2.start();
	
	
	
	t1.join();
	t2.join();
	System.out.println(t1.isAlive());
  System.out.println("ALL THE BEST...!!!");
	}

}
