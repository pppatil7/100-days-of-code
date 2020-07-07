package learn.corejava;

public class Emp {
	int id;
	String name;
	Address address;
	Emp(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
