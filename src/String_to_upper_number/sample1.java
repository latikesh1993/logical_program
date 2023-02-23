package String_to_upper_number;

public class sample1 {
   
	public static void main(String[] args) {
		
	
	String s1= "i am boy i am going to school";
	String [] words= s1.split(" ");
	for (String word : words) {
		
		System.out.print(word.substring(0, 1).toUpperCase()+word.substring(1)+" ");
	}
	
	}
}
