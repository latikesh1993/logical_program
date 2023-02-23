package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class sample2 {
public static void main (String [] args) {
	
	
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
          
         hash.put(1020, "Latikesh");
         hash.put(1021, "Bhosale");
         hash.put(1022, "Parola");
         hash.put(1023, "Now in");
         hash.put(1024, "Pune");
        
	   System.out.println(hash.containsKey(1026));
	   System.out.println("_____________________________________");
	
	   System.out.println(hash.get(1021));
	  System.out.println("------------------------"); 
	  Set<Integer> allkeys = hash.keySet();
	  
	  for (Integer keys : allkeys) {
		
		  
		  System.out.println(keys+":"+hash.get(keys));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
