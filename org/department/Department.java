package org.department;

import org.college.College;

public class Department extends College  {
	public void deptname() {
		System.out.println("computer science");
	}
	public static void main(String[] args) {
		Department dep=new Department();
		dep.deptname();
		dep.collegeName();
		dep.collegeCode();
		dep.collegeRank();
		
	}

}
