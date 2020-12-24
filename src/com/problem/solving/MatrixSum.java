package com.problem.solving;

public class MatrixSum {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[][] b= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		int rows=a.length;
		int cols=a[0].length;
		int add[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				 add[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				 System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}

	}

}
