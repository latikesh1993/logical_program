

public class string_number_repeated {
	
	public static void main(String[] args) {
		String s1 ="I am Latikesh Bhosale";
		  s1=s1.replace(" ", "");
		int count;
		char ar []=s1.toCharArray();
	     int l =s1.length();
   for (int i=0; i<l-1; i++) {
	   count=1;
	   for(int j=i+1; j<l; j++) {
		   if(ar[i]==ar[j]) {
			   count++;
			   for (int k=j; k<l-1; k++) {
				   ar[k]=ar[k+1];
			   }
			 l--;
		   }
		   
	   }
	   
	   System.out.println(ar[i]+"="+count);
   }
	}
}
