package learn.corejava;

public class Person {
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Emp1 extends Person{
	float salary;
	Emp1(int id,String name,float salary){
		super(id,name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
