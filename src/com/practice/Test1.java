package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static int profit(List<Integer> list, int target) {
		int counter=0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)+list.get(j)==target) {
					counter++;
				}
			}
		}
		return (counter/2);
	}
	public static void main(String[] args) {
	   List<Integer> list=new ArrayList<Integer>();
	   list.add(1);
	   list.add(3);
	   list.add(46);
	   list.add(1);
	   list.add(3);
	   list.add(9);
	   int target=47;
	   System.out.println(profit(list, target));

	}

}
