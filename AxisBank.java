package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
    	System.out.println("the deposit amount is high ");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		BankInfo info = new BankInfo();
		
		bank.savings();
		bank.fixed();
		info.deposit();
	    bank.savings();
	    bank.deposit();
		bank.fixed();
		

	}

}
