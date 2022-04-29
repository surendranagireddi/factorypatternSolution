package com.java.personFactory;

import com.java.comp.AadharDetails;
import com.java.comp.Customer;
import com.java.comp.Employee;
import com.java.comp.Person;
import com.java.comp.Student;

public class PersonFactory {
	
	public static Person getPerson(String type) throws IllegalAccessException {
		
		Person per = null;
		AadharDetails details = null;
		
		if(type.equalsIgnoreCase("emp")) {
			details = new AadharDetails(1234567l,20,92992l);
			per = new Employee("rani","hyd",details,"Hcl",6767.0);
		}
		else if(type.equalsIgnoreCase("cust")) {
			details = new AadharDetails(12356l,21,99099l);
			per = new Customer("deva","vizag",details,1234,900.0);
		}
		else if(type.equalsIgnoreCase("stud")) {
			details = new AadharDetails(123452l,17,98987l);
			
			per = new Student("rama","hyd",details,"java",1234);
		}
		else {
			throw new IllegalAccessException("Invalid person");
		}
		return per;
		
	}

}
