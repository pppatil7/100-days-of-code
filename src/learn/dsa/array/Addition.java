package learn.dsa.array;

public class Addition {
	int[] arr;
	int sum = 0;

	public void sum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			System.out.println(sum);

		}
	}

}
