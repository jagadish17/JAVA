package week1.day1;

public class mobile {
	String mobileBrandName = "redmi note pro";
	char mobileLogo = 'M';
	short noOfMobilePieces = 24;
	int modelNumber = 7 ;
	long mobileImeiNumber = 1234567890;
	float mobilePrice = 16000;
	boolean isDamaged = false;

public static void main(String[] args) {
	mobile mobile =new mobile();
	System.out.println("BRAND NAME="+mobile. mobileBrandName );
	System.out.println("MOBILE LOGO ="+mobile. mobileLogo);
	System.out.println("NO OF MOBILES ="+mobile.noOfMobilePieces );
	System.out.println("MODEL NO =" +mobile.modelNumber );
	System.out.println("IMEI NO ="+mobile.mobileImeiNumber );
	System.out.println("MOBILE PRICE =" +mobile.mobilePrice);
	System.out.println("IS DAMAGED ="+mobile. isDamaged);
}
}