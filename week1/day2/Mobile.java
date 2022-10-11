package week1.day2;

public class Mobile {
	public void sendMessage() {
		System.out.println("Sent Message");
	}
	public void shareDocument() {
		System.out.println("Share Document");
	}
	public void call() {
		System.out.println("call");
	}
	public static void main(String[]args) {
		Mobile mobi=new Mobile();
		mobi.sendMessage();
		mobi.shareDocument();
		mobi.call();
	}

}
