package com.wars.star.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wars.star.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
