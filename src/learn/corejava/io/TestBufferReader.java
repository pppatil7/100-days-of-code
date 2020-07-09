package learn.corejava.io;
  
import java.io.*;  
public class TestBufferReader{    
public static void main(String args[])throws Exception{             
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name=br.readLine();    
    System.out.println("Welcome "+name);
    System.out.println("enter your city:");
    String city=br.readLine();
    System.out.println("your city is:"+city);
}    
}  
