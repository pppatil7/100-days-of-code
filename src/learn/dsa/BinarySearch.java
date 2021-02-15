package learn.dsa;

public class BinarySearch {

	public static int binarySearch(int[] arr,int low,int high,int key) {
		if(high<low)
			return -1;
		int mid=(high+low)/2;
		if(arr[mid]==key)
			return mid;
		if(key>arr[mid])
		return binarySearch(arr, (mid+1), high, key);
		return binarySearch(arr, low, (mid-1), key);	
	}
	public static void main(String[] args) {
		

	}

}
