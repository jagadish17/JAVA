package Student;

import org.department.Department;

public class Student extends Department {
	public void studentname() {
		System.out.println("Name - jagadish");
		
	}
	public void studentid() {
		System.out.println("ID - 19UCS2481");
		
	}
public void studentDept() {
	System.out.println("Dept - cs");
		
	}
public static void main(String[] args) {
	Student info=new Student();
	info.studentname();
	info.studentid();
	info.studentDept();
	info.collegeName();
	info.collegeCode();
	info.collegeRank();
	
}
}
