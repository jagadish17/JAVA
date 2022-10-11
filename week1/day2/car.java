package week1.day2;

public class car {
	public void applyBreak() {
		System.out.println("Apply brake ");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
		
	}
    public void switchOnAc() {
    	System.out.println("On Ac");
    }
    public void applyAcclerate() {
    	System.out.println("Apply Accelerate");
    }
     public static void main(String[]args) {
    	 car car1=new car();
    	 car1.applyBreak();
    	 car1.applyGear();
    	 car1.switchOnAc();
    	 car1.applyAcclerate();
    	 
     }
    
}
