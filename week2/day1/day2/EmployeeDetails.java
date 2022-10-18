package week1.day2;

public class EmployeeDetails {
	public void empname(String name) {
		String Name = name;
		System.out.println(Name);
		
	}
	public void empid(int a) {
		int Id=a;
	    System.out.println(Id);
	}
	public void empaddress(String address) {
		System.out.println(address);
	}
	public void empmobilenumber(long b) {
    System.out.println(b);

}public static void main(String[]args) {
	EmployeeDetails details= new EmployeeDetails();
	   System.out.print("Employee Name-"); details.empname("Jeeva");
	   System.out.print("Employee Id -");  details.empname("10034");
	   System.out.print("Employee Address -");   details.empname("chennai");
	   System.out.print("Employee Mobile Number -");  details.empname("9878675645");
	    
}
	
}