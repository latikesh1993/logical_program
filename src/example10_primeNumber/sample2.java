package example10_primeNumber;

public class sample2 {

	
	public static void main(String[] args) {
		
		int num = 3;
		
		int count=0;
		
		
		for (int i=2; i<num; i++) {
			
			if(num%i==0) {
				
				count++;
				
			}
			
			
			
		}
		
		if(count==1) {
			
			System.out.println("Given number is not prime");
		}
		else {
			
			System.out.println("Given number is prime");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
