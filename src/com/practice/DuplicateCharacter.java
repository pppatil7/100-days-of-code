package com.practice;

public class DuplicateCharacter {
    
    static void charCounts(String str, int[] count) {
    
    	for(int i=0;i<str.length();i++) {
    		count[str.charAt(i)]++;
    	}
    }
    static void printChars(String str1) {
    	int[] countArr=new int[256];
    	charCounts(str1, countArr);
    	for(int i=0;i<256;i++) {
    		if(countArr[i]>1) {
    			System.out.println((char)(i) +  
                        ", count = " + countArr[i]);
    		}
    	}	
    }
	public static void main(String[] args) {
		String string="dhvsajdcjvjbcmvshgdbmggvdbfnvfhvczvh";
		printChars(string);

	}

}
