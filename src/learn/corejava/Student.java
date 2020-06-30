package learn.corejava;

public class Student {
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course){
    	this.rollno=rollno;
    	this.name=name;
    	this.course=course;
    	}
    Student(int rollno,String name,String course,float fee){
    	this(rollno,name,course);
    	this.fee=fee;  
    }    
    void display() {
    	System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}
