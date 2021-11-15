package org.demo;

public class Message {
	
	private ElementMessage em;
	private int id;
	private String name;
	
	
	public ElementMessage getEm() {
		return em;
	}
	public void setEm(ElementMessage em) {
		this.em = em;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Message [em=" + em + ", id=" + id + ", name=" + name + "]";
	}
	
	void show()
	{
		System.out.println("I am a fullfledged Message");
	}

}
