package OOPS;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("saving =6000");
	}
public static void main(String[] args) {
	AxisBank Bank=new AxisBank();
	Bank.saving();
	Bank.fixed();
	Bank.deposit();
	System.out.println(Bank);
}
}
