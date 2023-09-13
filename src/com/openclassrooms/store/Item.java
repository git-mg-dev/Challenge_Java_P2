package com.openclassrooms.store;

/**
 * Item class represents any kind of items in the inventory
 * The class must be abstract
 */
public abstract class Item {
	private Brand brand;
	private double price;

	public Item(Brand a, double b) {
		this.brand = a;
		this.price = b;
	}

	public Brand getBrand() {
		return brand;
	}
	
	// TODO : add brand setter
	
	public double getPrice() {
		return price;
	}
	
	// TODO : add price setter

	@Override
	public String toString() {
		return brand + " - " + price + "€";
	}
}
