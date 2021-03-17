package com.wars.star.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wars.star.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
