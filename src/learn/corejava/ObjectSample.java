package learn.corejava;

public class ObjectSample {

	public static void main(String[] args) {

		ObjectSample obj = new ObjectSample();
		
		obj.secondCall();
		
		Bicycle hero = new Bicycle();
		//System.out.println("Hero speed: "+ hero.getSpeed());
		hero.setSpeed(50);
		//System.out.println("Hero speed: "+ hero.getSpeed());
		hero.printState();
		
		
		
		
	}
	
	public void secondCall() {
		thirdCall();
		Bicycle honda = new Bicycle();
		//System.out.println(honda.getSpeed());
		honda.printState();
		honda.setGear(1);
		System.out.println("after changing honda state: ");
		honda.printState();
	}
	
	public void thirdCall() {
		System.out.println("Thirdcall");
		String d = "I'm dying";
	}
	

}
