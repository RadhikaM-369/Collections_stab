package com.xworkz.Collections.Stabilizer.DTO;

public class StabilizerDto {
	private int serialNo;
	private String brand;
	private int price;
	private double volt;
	
	public StabilizerDto(int serialNo, String brand, int price, double volt) {
		this.serialNo = serialNo;
		this.brand = brand;
		this.price = price;
		this.volt = volt;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getVolt() {
		return volt;
	}

	public void setVolt(double volt) {
		this.volt = volt;
	}
	
	public String toString() {
		return "This is Customized Object";
	}
	

}
