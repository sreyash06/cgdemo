package com.st.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.st.dao.LaptopDao;
import com.st.entity.Laptop;


@Service

public class LaptopService implements LaptopDao {

	List<Laptop> laptopList = new ArrayList<>();

	@Override

	public String addLaptop(Laptop laptop) {

		laptopList.add(laptop);

		return "Laptop added successfully";

	}

	@Override

	public List<Laptop> getallLaptops() {

		return laptopList;

	}

}