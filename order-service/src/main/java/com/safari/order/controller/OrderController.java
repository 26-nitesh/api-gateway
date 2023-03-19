package com.safari.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.safari.order.commons.TransactionResquest;
import com.safari.order.entity.Order;
import com.safari.order.repo.OrderRepository;
import com.safari.order.service.OrderService;

@RestController
@ResponseBody
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/")
	public String see() {
		return "from order";
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody TransactionResquest resquest) {
		return service.process(resquest);
	}

}
