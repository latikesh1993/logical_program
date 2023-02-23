package Armstrong_number;

public class sample3 {
public static void main (String [] args) {
	
	
	int orgnum =370;
	int sum =0;
	
	for (int i=orgnum; i>0; i=i/10) {
		
		int rem = i % 10;
		
		sum = sum +(rem*rem*rem);
		
		
		
	}
	
	if (orgnum==sum)
	{
		System.out.println("Given number is armstrong number");
	}
	
	else {
		System.out.println("Given number is not armstrong number");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
