package learn.corejava;
public class Bicycle {
	
	private int speed;
	private int gear;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void printState() {
		System.out.println("Speed is: "+ speed+ " and Gear is: "+ gear);
	}

	
	

}
