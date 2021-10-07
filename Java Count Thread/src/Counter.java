
public class Counter implements java.lang.Runnable{

	
	    @Override
	    public void run() {
	        Counter.countDown();
	        Counter.countUp();
	    }

	    public static void countDown(){
	        int i = 20;
	         while (i>0){
	          System.out.println("Remaining: "+i);
	          try {
	            i--;
	            Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
	           }
	           catch (InterruptedException e) {
	            
	           }
	         }
	    }

	    public static void countUp(){
	    	for(int i = 0; i <= 20; i++)
				System.out.println("Remaining: "+i);
	    	try {
	         
	            Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
	           }
	           catch (InterruptedException e) {
	            
	           }
	         }
	    

	
	
	public static void main(String[] args) {
		
		Counter countDown = new Counter();
		Thread t1 = new Thread(countDown);
		t1.start();
		
		Counter countUp = new Counter();
		Thread t2 = new Thread(countUp);
		t2.start();
		
		 
	}

}
