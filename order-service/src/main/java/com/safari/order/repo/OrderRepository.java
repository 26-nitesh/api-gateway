package com.safari.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safari.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {


}
