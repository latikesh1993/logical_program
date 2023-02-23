package example12_Imp_Reverse_Number_without_String_Function;

public class sample1 {
public static void main(String[] args) {
	
	int orgnum= 1324;
	
	int revnum = 0 ;
	
	for (int i=orgnum; i>0; i=i/10) {
		
		int rem = i%10;
		
		revnum= revnum*10 + rem;
		
	}
	
	
	System.out.println(revnum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
