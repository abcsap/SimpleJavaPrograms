import java.util.*;


public class Link1
{
 public static void main(String args[])
 {
    
      
	LinkedList ll = new LinkedList();
     
     	ll.add("F");
     
 	ll.add("B");
     
 	ll.add("D");
  
    	ll.add("E");
   
   	ll.add("C");
  
    	ll.addLast("Z");
 
     	ll.addFirst("A");

      	ll.add(1, "A2");
   
   	System.out.println("Original contents of ll: " + ll);

 
      	ll.remove("F");
    
  	ll.remove(2);
   
   	System.out.println("Contents of ll after deletion: "
       + ll);
    
  	ll.removeFirst();
   
   	ll.removeLast();
   
   	System.out.println("ll after deleting first and last: "
       + ll);

  
    	Object val = ll.get(2);
   
   	ll.set(2," Changed");
  
   	 System.out.println("ll after change: " + ll);
   
	}


}
/*
output:


C:\Users\my\Desktop\sumita>javac Link1.java
Note: Link1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\Users\my\Desktop\sumita>java Link1
Original contents of ll: [A, A2, F, B, D, E, C, Z]
Contents of ll after deletion: [A, A2, D, E, C, Z]
ll after deleting first and last: [A2, D, E, C]
ll after change: [A2, D,  Changed, C]

*/