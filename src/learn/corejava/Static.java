package learn.corejava;

public class Static {
	int rollno;
	String name;
	static String college="sinhgad acdemy of engineering";
	
	static void change() {
		college="coep";
	}
	Static(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

}
