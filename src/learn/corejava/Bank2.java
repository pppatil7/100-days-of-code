package learn.corejava;

public abstract class Bank2 {
	abstract int getrateofinterest(){
		return 0;
	}
}
class pnb extends Bank2 {
	int getrateofinterest() {
		return 6;
	}
}
class axis extends Bank2 {
	int getrateofinterest() {
		return 7;
	}
}
