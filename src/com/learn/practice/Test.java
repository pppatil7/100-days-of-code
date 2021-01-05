package com.learn.practice;
        
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
        
public class Test {
	static int smallValue(int[] arr){
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }

	// Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {

     int counter=arr.length;
     
     List<Integer> list=new ArrayList<Integer>();
     list.add(counter);
     for(int i=0;i<arr.length;i++){
         
         int small=smallValue(arr);
         for(int j=0;j<arr.length;j++){
             arr[j]=arr[j]-small;
          if(arr[j]==0){
             counter--;
         }   
         }
         if(counter>0){
             list.add(counter);
         }
     }
     int arrSize=list.size();
     int[] arr1=new int[arrSize];
     for(int i=0;i<arrSize;i++){
         arr1[i]=list.get(i);
     }
     return arr1;
    }
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 3, 3, 2, 1};
		int[] arr1 = cutTheSticks(arr);
		System.out.println(Arrays.toString(arr1));
	}
}