package example10_primeNumber;

public class sample6 {
public static void main(String[] args) {
	
	   int num=39;
	   int  count=0;
	   
	   for (int i=2; i<num; i++) {
		   
		   
		   if (num%i==0) {
			   
			   count++;
			   break;
			   
			   
		   }
		   
		   
		}
		   
		   
	   if (count==1) {
		   
		   System.out.println("Given number is not prime");
	   }
	   else {
		   
		   System.out.println("Given number is  prime");
	   }











}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

