package learn.dsa.array;

public class TestArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 5, 4, 5, 7 };
		char arr1[] = { 'a', 'b', 'a', 'p', 'a', 't', 'i', 'l' };
		System.out.println(arr[7]);
		System.out.println(arr1[3]);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i]);
			i++;
		}

		Student[] stud=new Student[4];
		
		stud[0]= new Student(1,"msd");
		stud[1]=new Student(2,"yuvraj");
		stud[2]=new Student(3,"rohit");
		System.out.println();
		
		for(int j=0;j<3;j++) {
			System.out.println(stud[j].id+" "+stud[j].name);
		}
		
	}

}
