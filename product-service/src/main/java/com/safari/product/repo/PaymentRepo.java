package com.safari.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safari.product.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer>{

}
