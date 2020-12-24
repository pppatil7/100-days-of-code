package com.problem.solving;

public class DuckNumber {
     
	public static void main(String[] args) {
		   String str1="abcd";
		   String str2="aebcd";
		   
		   char[] ch1=str1.toCharArray();
		   char[] ch2=str2.toCharArray();
		   
		   for(int i=0;i<ch1.length;) {
			   for(int j=0;j<ch2.length;j++) {
				   if(ch1[i]==ch2[j]) {
					  // System.out.println(ch2[j]);
					   i++;
				   }	
			
				   else {
					   System.out.println(ch2[j]);
				   }
			   }
		   }
	}
}
