package example11_reverseNumber;

public class sample8 {
public static void main(String[] args) {
	
	   int orgnum=44778833;
	   String org = Integer.toString(orgnum);
	   String rev="";
	   for (int i=org.length()-1; i>=0; i--) {
		   
		   rev =rev + org.charAt(i);
		   
		   
	   }
	
	int revnum = Integer.parseInt(rev);
	System.out.println(revnum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
