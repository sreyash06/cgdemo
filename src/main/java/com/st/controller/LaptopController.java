package com.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import com.st.entity.Laptop;
import com.st.service.LaptopService;


@RestController

@RequestMapping("/laptopapi")

public class LaptopController {

	@Autowired

	private LaptopService lservice;

	@PostMapping("/")

	public String addLaptop(@RequestBody Laptop lp) {

		return lservice.addLaptop(lp);

	}

	@GetMapping("/get")

	public List<Laptop> getAll() {

		return lservice.getallLaptops();

	}

}