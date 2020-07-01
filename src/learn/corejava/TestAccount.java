package learn.corejava;

public class TestAccount {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setacc_no(78463875);
		a1.setname("patil");
		a1.setemail("examphjbbj");
		a1.setamount(75666f);
		
		System.out.println(a1.getacc_no()+" "+a1.getname()+" "+a1.getemail()+" "+a1.getamount());

	}

}
