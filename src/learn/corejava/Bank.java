package learn.corejava;

public class Bank {
	int getRateOfInterest() {
		return 0;
	}
}
	class SBI extends Bank {
		int getRateOfInterest() {
		return 2;
	}
	}
	class IDBI extends Bank {
		int getRateOfInterest() {
		return 3;
	}
}
	class HDFC extends Bank{
		int getRateOfInterest() {
		return 4;
	}
}

