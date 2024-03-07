package com.example.Mobile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mobiledb")
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int rn;
	private String brand;
	private String color;
	private int price;
	
	public void setRn(int rn) {
		this.rn = rn;
	}
	public int getRn() {
		return rn;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
		public void setPrice(int price) {
		this.price = price;
	}
		public int getPrice() {
			return price;
		}
}
