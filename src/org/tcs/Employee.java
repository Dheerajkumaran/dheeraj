package org.tcs;

import java.lang.reflect.Constructor;

public class Employee extends constructor{
	public Employee(){
		super("dhee");
		System.out.println("default constructor");
	}public Employee(int id) {
		this();
		System.out.println("parameterised int cons");
		System.out.println(id);
		
	}
	
	
	//public static void main(String[] args) {
	//	Employee c=new Employee();
	//	Employee ce = new Employee(200);
	//}
}
