public class Sleepandwait {
	    private static Object obj= new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(200);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 2 seconds");
	        synchronized (obj) 
	        {
	            obj.wait(200);
	            System.out.println("Object '" + obj + "' is woken after" + " waiting for 2 seconds");
	        }
	    }
	}
