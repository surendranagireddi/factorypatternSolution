package com.java.comp;

public class Student extends Person{
	
	private String course;
	private int rollNo;
	

	public Student(String name, String addrs, AadharDetails aadhar,String course,int rollNo) {
		super(name, addrs, aadhar);
		System.out.println(" student 5 :: param constructor");
		this.course = course;
		this.rollNo = rollNo;
		
		
	}


	@Override
	public String toString() {
		return "Student [course=" + course + ", rollNo=" + rollNo + "]";
	}
	
	
	

}
