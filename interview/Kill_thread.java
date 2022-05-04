package interview;

public class Kill_thread extends Thread{
	
	
	public static void main(String[] args) {		        
		        // creating three threads   
		Kill_thread t1=new Kill_thread ();    
		Kill_thread t2=new Kill_thread ();   
		Kill_thread t3=new Kill_thread ();   
		        // call run() method   
		        t1.start();  
		        t2.start();  
		        // stop t3 thread   
		        t3.stop();  
		        System.out.println("Thread t3 is stopped");    
		    }    
		
		
		
		
	
		
		    
		    public void run()  
		    {    
		        for(int i=1; i<5; i++)  
		        {    
		            try  
		            {  
		                // thread to sleep for 500 milliseconds  
		                sleep(500);  
		                System.out.println(Thread.currentThread().getName());    
		            }catch(InterruptedException e){System.out.println(e);}    
		            System.out.println(i);    
		        }    
		    }    
		  
		} 