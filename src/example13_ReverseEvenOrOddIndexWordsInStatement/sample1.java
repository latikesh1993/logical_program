package example13_ReverseEvenOrOddIndexWordsInStatement;

public class sample1 {
public static void main (String [] args ) {
	
	 String s1 = "my name is abc";
	 
	 String [] ar = s1.split(" ");
	
	for (int i=0; i<=ar.length-1; i++) {
		
		
		String org = ar[i];
		
		if (i%2==0) {
			
		String rev = revesrString(org);
		System.out.print(rev+" ");
		}
		else {
			
			System.out.print(org+" ");
		}
		}
}
	
	public static String revesrString(String org) {
		
		String rev= " ";
		
		for (int i=org.length()-1; i>=0; i-- )
		{
			
			rev= rev+ org.charAt(i);
			
		}		
		
		return rev;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

