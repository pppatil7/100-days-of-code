package learn.dsa.array;

public class TwoDArray {

	public static void main(String[] args) {
		
		int arr[][]= {{1,3,2},{5,1,4},{3,8,7}};
		int arr1[][]={{2,5,-1},{4,2,-4},{-3,5,2}};
		
		int arr2[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr2[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}	
	}
}