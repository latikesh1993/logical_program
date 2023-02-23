
public class sample2 {
	public static void main(String[] args) {
		
		
		String s1= "aabcdrree";
		
		String s2 ="a";
		int count=0;
		
		
		while(s1.contains(s2))
		{
			
			count++;
			s1=s1.replaceFirst(s2,"");
			
		}
		System.out.println(count);
		System.out.println(s1);
						
		
		
		
		
		
		
		
		
	}

}
