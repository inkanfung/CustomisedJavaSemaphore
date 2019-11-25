import java.util.*;
public class user extends Thread
 {								
  private int id;
  private int num_elements;
  public static Buffer buf; //this is for calling the addbufelement function in buffer
		  
  public user(int i, int el, Buffer b)	        				//User arguments: User ID, number of elements to add, buffer object
		  {id = i; num_elements = el; buf = b;}
  

//Add integer element to buffer, element value should iterate from 0, 1, 2 .... num_elements 
//every time the user submits onto the buffer   
		
   public void run(){
	   for(int i = 0; i < num_elements; i++){
			
			buf.addbufelement(id, i);
   
   
		}
	}
 }  