package com.wars.star.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wars.star.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
