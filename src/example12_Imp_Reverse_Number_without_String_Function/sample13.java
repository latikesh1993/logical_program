package example12_Imp_Reverse_Number_without_String_Function;

public class sample13 {
public static void main(String[] args) {
	
	int org =9987;
	
     int rev=0;
     
	
	
	while(org>0) {
		
		int rem =org%10;
		
		rev=rev*10+rem;
		
		org=org/10;
		
		
		
		
	}
	
	
	
	System.out.println(rev);
	
	
	
	
	
}
}
