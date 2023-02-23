package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class sample1 {
	
	//put(key,value)  --> use to add keys & values in hashmap
	//containsKey(key)   --> use to verify given key present or not . if present-> return true, if not present-> return false. 
	//mp.get(key)   --> return value
	//mp.keySet()   --> return all the keys from hashmap

		public static void main (String [] args)
{
	
     HashMap<Integer, String> mp = new HashMap<Integer, String>();
     
     
     mp.put(101, "HI");
     mp.put(102, "GM");
     mp.put(103, "How r u ?");
     
     System.out.println(mp.containsKey(101));
     System.out.println(mp.containsKey(104));
     System.out.println("----------------------------");
     System.out.println(mp.get(101));
     System.out.println(mp.get(102));
   System.out.println("--------------------------------");   
     Set<Integer> allkeys = mp.keySet();
     
     for (Integer keys : allkeys) {
		
    	 System.out.println(keys+":"+mp.get(keys));
    	 
    	 
    	 
    	 
	}


















}}
