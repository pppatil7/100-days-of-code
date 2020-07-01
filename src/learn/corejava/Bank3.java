package learn.corejava;

public interface Bank3 {
	float rateofinterest();
}
class mahindra implements Bank3{
	public float rateofinterest() {
		return 9.1f;
	}
}
class kotak implements Bank3{
	public float rateofinterest() {
		return 7.7f;
	}
}
