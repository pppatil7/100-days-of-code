package learn.corejava;

public class AnimalSuper {
    AnimalSuper() {
    	System.out.println("animal is created...");
    }
}
class Dog1 extends AnimalSuper{
	Dog1(){
		super();
		System.out.println("dog is created...");
	}
}
