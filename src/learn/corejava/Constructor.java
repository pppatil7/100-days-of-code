package learn.corejava;

public class Constructor {

	int id;
	String name;
	static String college="sinhgad academy of engineering";
	Constructor(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
}
