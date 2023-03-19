package com.safari.order.service;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.safari.order.commons.Payment;
import com.safari.order.commons.TransactionResquest;
import com.safari.order.entity.Order;
import com.safari.order.repo.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	@Autowired
	private RestTemplate template;

	public ResponseEntity<Object> process(TransactionResquest resquest) {
     
		Order order = resquest.getOrder();
    Payment payment = resquest.getPayment();
    payment.setAmount(Double.valueOf(order.getPrice()));
    payment.setOrderId(order.getId());
    Payment paymentResponse = template.postForObject("http://PAYMENT-SERVICE/payment/save", payment,Payment.class);
     if(paymentResponse.getPaymentStatus().equals("sucess")) {
    	 return new ResponseEntity<>(List.of(paymentResponse,repo.save(order)), HttpStatus.CREATED);
     }
     return ResponseEntity.ok("Could not save");
	}

	
}
