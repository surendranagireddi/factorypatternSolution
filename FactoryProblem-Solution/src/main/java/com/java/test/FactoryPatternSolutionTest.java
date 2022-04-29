package com.java.test;

import com.java.comp.Person;
import com.java.personFactory.PersonFactory;

public class FactoryPatternSolutionTest {
	
	public static void main(String[] args) throws IllegalAccessException {
		
		// use factory to create employee class obj
		
		Person emp = PersonFactory.getPerson("emp");
		System.out.println(emp);
		
		System.out.println("=================================");
		
		Person cust = PersonFactory.getPerson("cust");
		System.out.println(cust);
		
	}

}
