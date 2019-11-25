import java.util.*;

public class listCount {

public static void main(String[] args)
  {
	  
   int num_users = 0;
   int elements = 0;
   int bufferSize = 0;
		
   Scanner s = new Scanner(System.in);
   
   System.out.println("Enter number of users:");   //Specify number of users
   
   int user = s.nextInt();
   num_users = user;
   
   System.out.println("Enter number of elements per user:");		//Specify number of elements submitted per user	
     
   int element = s.nextInt();
   elements = element;
	s.close(); 
	 
  	long startTime = System.currentTimeMillis();
	
	Buffer b;
	bufferSize = elements * num_users;
	b = new Buffer(bufferSize);						//Create buffer
	
	
  //Create X users that will concurrently add elements to the Buffer object b
   
   //You will want to think about creating a method that will add elements to the buffer
   
   user[] n = new user[num_users];
   Thread t[] = new Thread[num_users];
   
   for(int i=0; i < user; i++){
			n[i] = new user(i+1, elements, b);
			t[i] = new Thread(n[i]);
			t[i].start();
	 
	 
		try{
			t[i].join();
		}catch(InterruptedException e){
			System.out.println("Error e");
		}
	  }
   
   b.finalSummation();		   //When buffer is full, calculate SUM of elements within the buffer
   
   long endTime = System.currentTimeMillis();
   System.out.println("Program took " + (endTime - startTime) + " milliseconds to complete");
   
  }
}

