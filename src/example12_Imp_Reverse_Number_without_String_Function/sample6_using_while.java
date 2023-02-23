package example12_Imp_Reverse_Number_without_String_Function;

public class sample6_using_while {
public static void main(String[] args) {
	
	  int orgnum=1234567;
	  int revnum=0;
	  
	  while(orgnum>0) {
			
			int rem = orgnum%10;
			
			revnum= revnum*10 +rem;
			
			orgnum= orgnum/10;}
	
	System.out.println(revnum);
	
	
	
	
	
	
	
	
	
}
}
