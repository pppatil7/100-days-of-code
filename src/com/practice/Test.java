package com.practice;

public class Test {

	public static void main(String[] args) {
		
		int i=10;
		Integer iRef=new Integer(i); //Boxing
        int j=iRef.intValue(); //unBoxing
        Integer kRef=i; //AutoBoxing
        int k=kRef; //AutoUnBoxing
        
        String str=new String("Hii..");
        StringBuffer buffer=new StringBuffer("Hii..");
        StringBuilder builder=new StringBuilder("Hii..");
        
        String str1=str.concat("Hello.."); //IMMUTABLE
        buffer.append("Hello.."); //MUTTABLE
        builder.append("Hello.."); //MUTTABLE
        
        System.out.println(str); 
        System.out.println(buffer); 
        System.out.println(builder); 
        System.out.println(str1);
        
	}

}
