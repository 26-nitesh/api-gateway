package com.safari.order.commons;

import com.safari.order.entity.Order;

public class TransactionResquest {

	private Order order;
	private Payment payment;
	public TransactionResquest() {
		// TODO Auto-generated constructor stub
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
}
