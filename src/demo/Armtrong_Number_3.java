package demo;

public class Armtrong_Number_3 {
	
	public static void main(String [] args) {
		
		int orgnum=9;
		
		int sum=0;
		
		
		for (int i=orgnum; i>0; i=i/10) {
			
			int rem = i%10;
			
			sum= sum+(rem*rem*rem);
			
			
			
		}
		
		if (orgnum==sum) {
			
			System.out.println("Given number " +orgnum+ " is armtrong number");
		}
		
		else{
			
			System.out.println("Given number " +orgnum+ " is not armtrong number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
	
}
