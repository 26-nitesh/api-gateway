package com.safari.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safari.payment.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer>{

}
