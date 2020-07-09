package learn.corejava.io;

import java.util.*;

public class TestScanner {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter your name: ");
		String name = s1.nextLine();
		System.out.println("enter city name: ");
		String city = s1.next();
		s1.close();
		System.out.println("-------your details are-------");
		System.out.println("name: "+name);
		System.out.println("city: "+city);
		
		
		
	}

}
