package week1.day1;


public class Twowheeler {
	int noOfWheels=2;
	 short noOfMirrors=2;
	 long chassisNumber=192800;
	 boolean isPunctured = false;
	 double bikeKM=2030.22;
	 String bikeName= "pulsar";
	 
public static void main(String[] args) {
Twowheeler bike = new Twowheeler();
System.out.println("NO OF WHEELS="   +bike.noOfWheels);
System.out.println("NO OF MIRRORS =" +bike.noOfMirrors);
System.out.println("CHASSIS NUMBER ="+bike.chassisNumber);
System.out.println("IS PUNCTURED ="  +bike.isPunctured);
System.out.println("KILOMETERS ="    +bike.bikeKM);
System.out.println("BIKENAME="       +bike.bikeName);

}
}