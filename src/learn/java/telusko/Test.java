package learn.java.telusko;

public class Test{
	   public static void main(String args[]){
	      String str = "aaaaaaaaaa";
	      String anotherString = "aaaaa";
	      Object objStr = str;
	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));
	   }
	}
