package example12_Imp_Reverse_Number_without_String_Function;

public class sample19 {
public static void main(String[] args) {
	
	long org=1234567891;
	long rev=0;
	
	for (long i=org; i>0; i=i/10) {
		
		long rem =i%10;
		
		rev =rev*10+rem;
		
		
		
		
	}
	
	
	System.out.println(rev);
	
	
	
	
	
	
	
	
	
	
	
}
}
