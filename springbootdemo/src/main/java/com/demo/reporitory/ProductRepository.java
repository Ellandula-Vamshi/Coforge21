package com.demo.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.demo.pojo.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}