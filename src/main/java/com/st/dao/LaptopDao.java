package com.st.dao;

import java.util.List;

import com.st.entity.Laptop;

public interface LaptopDao {

	public String addLaptop(Laptop laptop);

	public List<Laptop> getallLaptops();

}