package demo;

public class Armtrong_Number2 {
	
	public static void main(String[] args) {
	
		int orgnum=153;
		
		int sum=0;
		
		for (int i=orgnum; i>0; i=i/10) {
			
			
			int rem = i%10;
			sum= sum+(rem*rem*rem);
			
			
			
		}
		
		if (orgnum==sum) {
			
			System.out.println("Given number is "+orgnum+ " is armtrong number");
		}
		
		else {
			
			System.out.println("Given number is not "+orgnum+ " is armtrong number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
