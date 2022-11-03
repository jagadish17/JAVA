package org.college;

public class College {
	public void collegeName() {
		System.out.println("ClgName - vidya mandir college");	
	}
	public void collegeCode() {
		System.out.println("ClgCode - 193");	
		
	}
	public void collegeRank() {
		System.out.println("ClgRank - 4th rank");	
		
	}
	public static void main(String[] args) {
		College name=new College();
		name.collegeName();
		name.collegeCode();
		name.collegeRank();
	}

}
