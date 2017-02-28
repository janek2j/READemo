package model;

public class Property {

	private String type;
	private String address;
	private double area;	
	private int price;
	private int test___test;
	
	public Property() {
		type = "flat";
		address = "default address";
		area = 999;
		price = 99999;
	}
	
	public Property(String type, String address, double area) {
		this.type = type;
		this.address = address;
		this.area = area;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
