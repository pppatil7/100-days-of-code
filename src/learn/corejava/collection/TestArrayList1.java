package learn.corejava.collection;
import java.util.*;

import java.util.ArrayList;


public class TestArrayList1 {

	public static void main(String[] args) {
		Student s1 = new Student(101,"akshay",23);
		Student s2 = new Student(102,"ajay",22);
		Student s3 = new Student(103,"varun",24);
	
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		Iterator itr =a1.iterator();
		
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
			
		}
		
		
		
	}

}
class Student {
	int rollno;
	String name;
	int age;
	
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}