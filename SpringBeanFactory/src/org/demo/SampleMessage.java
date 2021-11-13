package org.demo;

public class SampleMessage {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	void show()
	{
		System.out.println("message : "+message);
	}
}
