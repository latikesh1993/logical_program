package example13_ReverseEachWordInStatement_retrun;

public class sample2 {
	public static void main(String[] args) 
	{
		
		String s1="my name is abc";    //ym eman  si cba
		
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		//      0    4<=3    
		for(int i=0; i<=ar.length-1; i++)
		{				//  2
			String org = ar[i];  //abc
			
			String rev = reverseString(org);
			
			System.out.print(rev+" ");   //ym eman si cba
		}
		
	}
	
	
	public static String reverseString(String org) 
	{
		String rev="";
		for(int i=org.length()-1; i>=0; i--) 
		{
			rev=rev+org.charAt(i);
		}
		return rev;
	}
	
	
	

	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

