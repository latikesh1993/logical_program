package demo;

import java.util.Scanner;

public class accept_input_from_user_1 {
public static void main(String[] args) {
	

	
	//by using scanner class you get input from user
	//there are some non-static method in scanner class that we use to get input from user
	System.out.print("Enter Num1:"); 
     Scanner scan = new Scanner(System.in);
      
     int num1 = scan.nextInt();
//     System.out.println(num1);
     
     System.out.print("Enter NUm2:");
     int num2=scan.nextInt();
     System.out.println("Addition:"+(num1+num2));
   

}
}
