package learn.corejava;

public class TestBank {

	public static void main(String[] args) {
		SBI s=new SBI();
		IDBI i=new IDBI();
		HDFC h=new HDFC();
		System.out.println("sbi rate of interest: "+s.getRateOfInterest() );
		System.out.println("idbi rate of interest: "+i.getRateOfInterest());
		System.out.println("hdfc rate of interest: "+h.getRateOfInterest());

	}

}
