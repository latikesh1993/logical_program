package Armstrong_number;

public class sample1 {
	public static void main (String [] args) {
		
	int Orgnum = 152;
	
	int sum = 0;
	
	
		for (int i=Orgnum; i>0; i=i/10) {
			
		  int rem = i % 10;
			sum = sum + (rem*rem*rem);
			
		}
		
		if (Orgnum==sum) {
			
			System.out.println("Given number is armstrong num");
		}
		else {
			
			System.out.println("Given number is not armstrong num");
		}
		
		
		
		
		
		
		
		
		
	}

}
