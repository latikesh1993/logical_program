package example11_reverseNumber;

public class sample2 {
	public static void main(String [] args) {
		
		int orgNum=453678;
		
		String org = Integer.toString(orgNum);
		
		String rev= "";
		
		for(int i=org.length()-1; i>=0; i--) {
			
			   rev= rev + org.charAt(i);
			
			
		}
		
		int revNum = Integer.parseInt(rev);
		
		System.out.println(revNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
