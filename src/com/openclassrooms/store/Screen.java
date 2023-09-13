package com.openclassrooms.store;

public class Screen extends Item {

	private String resolution;

	public Screen(Brand brand, double price, String resolution) {
		super(brand, price);
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		String result = "Ecran " + super.toString() + " (resolution : " + this.resolution + ")";
		return result;
	}
	
	public String getResolution() {
		return this.resolution;
	}
	
	// TODO : add resolution setter

}
