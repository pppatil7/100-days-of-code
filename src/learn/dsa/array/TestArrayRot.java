package learn.dsa.array;

import java.util.Scanner;



public class TestArrayRot {

	public static void main(String[] args) {
		ArrayRot a1=new ArrayRot();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        a1.leftRotate(arr, 2, 7); 
        a1.printArray(arr, 7); 
	}
}