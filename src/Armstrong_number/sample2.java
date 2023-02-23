package Armstrong_number;

public class sample2 {
	public static void main (String [] args) {
		
		int num = 123;
		
		int sum =0;
		
		for (int i=num; i>0; i=i/10) {
			
			int rem = i % 10;
			
			sum = sum + (rem*rem*rem);
			
			
			
			
			
		}
		
		if (num==sum) {
			
			System.out.println("Given number is armstrong number");
		}
		
		else {
			
			System.out.println("Given number is not armstrong number");
		}
		
		
		
	}

}
