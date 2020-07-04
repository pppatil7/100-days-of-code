package learn.corejava;

public class TryCatch{  
	  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/2; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  