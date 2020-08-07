package learn.dsa;

public class StudentArray {

	public static void main(String[] args) {
		Student arr[]= new Student[5];
		arr[0]=new Student(1,"msd");
		arr[1]=new Student(2,"pandya");
		arr[2]=new Student(3,"rohit");
		arr[3]=new Student(4,"yuvraj");
		arr[4]=new Student(5,"bumrah");
		
		for(int i=0;i<arr.length;i++) {
		
		System.out.println(i+":"+arr[i].rollno+":"+arr[i].name);
		}
	}

}

class Student{
	  public int rollno;
	  public String name;
      public Student(int rollno,String name) {
    	  this.rollno=rollno;
    	  this.name=name;
    	  }
}