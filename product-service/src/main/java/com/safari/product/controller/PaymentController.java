package com.safari.product.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safari.product.entity.Payment;
import com.safari.product.repo.PaymentRepo;

@RestController
@RequestMapping("/product")
public class PaymentController {

	
	@Autowired
	private PaymentRepo repo;
	
	@PostMapping("/save")
	public Payment save(@RequestBody Payment payment) {
		payment.setTrxnId(UUID.randomUUID().toString());
		return repo.save(payment);
	}

}

