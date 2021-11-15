package org.demo;

public class ElementMessage {

	private int employeeId;
	private String name;
	private String message;
	
	
	public ElementMessage(int employeeId, String name, String message) {
		
		this.employeeId = employeeId;
		this.name = name;
		this.message = message;
	}
	
	
	void show()
	{
		System.out.println("Message details... ");
		System.out.println();
		System.out.println("Id        : "+employeeId);
		System.out.println("Name      : "+name);
		System.out.println("message   : "+message);

	}
	
}
