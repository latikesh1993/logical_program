package example10_primeNumber;

public class sample3 {
public static void main(String[] args) {
	
	int num=10;
	int count=0;
	
	for (int i=2; i<num; i++) {
		
		if(num%i==0)
		{
			count++;
			break;
		}
		
	}
	
	if(count==1) {
		
		System.out.println("Given number is not prime ");
	}
	
	else {
		
		System.out.println("Given number is prime ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
