package demo;

import java.util.Scanner;

public class fact_of_num {
public static void main(String [] args ) {
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter No:");
	int num=scan.nextInt();
	int fact= 1;
	
	for (int i=num; i>=1; i-- ) {
		
		
		fact= fact*i;
		
		
	}
	
	System.out.println("Given Number Factors="+fact);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
