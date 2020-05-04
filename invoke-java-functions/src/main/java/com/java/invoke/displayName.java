package com.java.invoke;

public class displayName {
	
	// static method
	public static String sayHello(String name) {
		return "Hello " + name;
	}
	
	// non static method
	public String appendName(String fName, String lName) {
		return fName + " " + lName;
	}

}
