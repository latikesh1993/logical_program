package example13_ReverseEvenOrOddIndexWordsInStatement;

public class sample2 {
public static void main(String[] args) {
	
	   String s1 = "my name is Latikesh";
	   
	   String [] ar =s1.split(" ");
	   
	  for (int i=0; i<=ar.length-1; i++) {
		  
		          String org =ar[i];
		          
		         if (i%2==0) {
		        	 String rev =" ";
		        	for (int j=org.length()-1; j>=0; j--) {
		        		
		        		rev = rev+ org.charAt(i);
		        		System.out.println(rev+" ");
		        	}
		        	
		        
		         } 
		     	else {
	        		System.out.println(org+" ");
	        	}
		          
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
