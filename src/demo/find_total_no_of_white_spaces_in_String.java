package demo;

public class find_total_no_of_white_spaces_in_String {
 public static void main (String []args) {
	 
	 String str = "a b  c d";
	 
	int count = 0;
	 
	 for (int i=0; i<=str.length()-1; i++) {
		 
		char str1 = str.charAt(i); 
		 
		 if(str1==' ') {
			
			 count++;
		 }
	 }
		 
		System.out.println("Spaces in given string:"+count); 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }


