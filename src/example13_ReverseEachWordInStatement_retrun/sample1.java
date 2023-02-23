package example13_ReverseEachWordInStatement_retrun;

public class sample1 {
public static void main (String []args ) {
	
	
	     String s1 = "my name is abc";
	     
	     String [] ar =s1.split(" ");
	
	for (int i=0; i<=ar.length-1; i++) {
		
		String org = ar[i];
		          String rev =reverseString(org);
		          System.out.print(rev+" ");
		  }
	
}


     

    public static String reverseString(String org) {
	
	    String rev =" ";
      
	    for (int i=org.length()-1; i<=0; i-- ) {
	    	
	    	rev= rev+org.charAt(i);
	    	
	    }
		return rev;
	
}
	    
	    
	    
	    
	    
	    
	    
	    	   
}
