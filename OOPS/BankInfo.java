package OOPS;

public class BankInfo {
	public void saving() {
		System.out.println("saving=12000");
	
	}
	public void fixed() {
		System.out.println("fixed=8000");
		
	}
	public void deposit() {
		System.out.println("deposit=10000");
		
	}
	public static void main(String[] args) {
		BankInfo info= new BankInfo();
		info.saving();
		info.fixed();
		info.deposit();
		System.out.println(info);
		
	}

}
