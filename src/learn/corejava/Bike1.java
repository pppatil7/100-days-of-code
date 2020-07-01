package learn.corejava;

public abstract class Bike1 {
  Bike1(){
	  System.out.println("bike is created...");
	  
  }
	  abstract void run();
	  void changegear() {
		  System.out.println("gear changed...");
  }
}
class honda extends Bike1{
	void run() {
		System.out.println("running safely...");
	}
}
