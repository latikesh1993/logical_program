package demo;

public class Imp_Armtrong_Number {
	
	public static void main(String[] args) {
		
		int orgNUm=153;
		
		int sum=0;
		
		for (int i=orgNUm; i>0; i=i/10) {
			
			
			int rem = i%10;
			
			sum= sum +(rem*rem*rem);
			
			
		}
		
		if(sum==orgNUm) {
			
			System.out.println("Given Num "+orgNUm+" is an Armtrong number");
			
			
		}
		
		
		else {
			
			System.out.println("Given Num "+orgNUm+" is not an Armtrong number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
