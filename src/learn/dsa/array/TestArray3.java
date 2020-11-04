package learn.dsa.array;

public class TestArray3 {
	public static int[] method() {
   	 return new int[] {1,2,3};
    }

	public static void main(String[] args) {
	     
		int[] arr=method();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
