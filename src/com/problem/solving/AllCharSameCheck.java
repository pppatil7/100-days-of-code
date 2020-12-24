package com.problem.solving;

public class AllCharSameCheck {
    
	public static void main(String[] args) {
		String str="aaaaaa";
		char[] ch=str.toCharArray();
	    int counter=0;
	    for(int i=0;i<ch.length;i++) {
	    	if(ch[0]==ch[i]) {
	    		counter++;
	    	}
	    }
		
	    if(counter==ch.length) {
	    	System.out.println("yes all characters are same");
	    }
	    else {
	    	System.out.println("all characters are not same");
	    }
		
	}

}
