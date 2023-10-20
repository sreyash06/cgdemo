package com.st.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity

public class Laptop {

	@Id
	private int laptopId;

	private String model;


	public Laptop() {
	}

	public int getLaptopId() {

		return laptopId;

	}

	public void setLaptopId(int laptopId) {

		this.laptopId = laptopId;

	}

	public String getModel() {

		return model;

	}

	public void setModel(String model) {

		this.model = model;

	}


	@Override

	public String toString() {

		return "Laptop [laptopId=" + laptopId + ", model=" + model + "]";

	}

}