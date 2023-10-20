package com.st.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.st.entity.Laptop;



@Repository

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}