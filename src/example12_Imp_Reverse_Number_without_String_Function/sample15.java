package example12_Imp_Reverse_Number_without_String_Function;

public class sample15 {
public static void main(String[] args) {
	
	int org =4321;
	int rev=0;
	for (int i=org; i>0; i=i/10) {
		int rem =i%10;
		rev = rev*10+rem;
		
		
	}
	
	
	System.out.println(rev);
	
	
	
	
	
	
	
	
	
	
}
}
