package org.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {

	private String brand ;
	private int ram;
	
	private SSD ssd;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public SSD getSsd() {
		return ssd;
	}
	public void setSsd(SSD ssd) {
		this.ssd = ssd;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", ssd=" + ssd + "]";
	}
	
	
	
}
