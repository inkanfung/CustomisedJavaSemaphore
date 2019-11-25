import java.util.*;
public class semaphore
  {
//Example class for synchronization primitive you might use - would recommend you consider selecting
//one or more of the following primitives to complete this exercise:
//Lock, counting semaphore, binary semaphore, monitor
//Users will have to submit elements onto the buffer concurrently

private int c = 0;

public semaphore(int i)
 {
	
	c = i;
 }

public synchronized void P() 
 {
	try{
	c = c - 1;
		while(c < 0){
			
			
			wait();
		}
	}	
		catch(InterruptedException e){
		System.out.print("error");
		}		
	
 }

public synchronized void V()
 {
	c = c + 1; 

	notifyAll();

	}
 }

