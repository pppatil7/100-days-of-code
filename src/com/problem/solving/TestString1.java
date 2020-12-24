package com.problem.solving;

public class TestString1 {

	static String removeCharacter(String str1,String str2) {
	    String str3="";    
        for(int i=0;i<str1.length();) {
        	for(int j=i+1;j<str2.length();j++) {
        		if(str1.charAt(i)==str1.charAt(j)) {
        		      	
        					i++;
        		}
        		
        		else if(str1.charAt(i)!=str1.charAt(j)) {
        			str3=str3+str1.charAt(i);
        			
        		}
        		
        	}
        	return str3;
        }
		
		
		return null;
	}
	public static void main(String[] args) {
		String str1="geeksforgeeks";
		String str2="mask";
		
		
   System.out.println(removeCharacter(str1, str2));		
		
		
		
		
	}
}
