package learn.corejava;

public class Student1 {
	int rollno;
	String name;
	String city;
	Student1(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	public String toString() {
		return rollno+" "+name+" "+city;
	}

}
