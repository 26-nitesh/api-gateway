package com.safari.order.commons;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Payment {

		private String paymentStatus;
		private String trxnId;
		private int orderId;
		private String status;
		private double amount;
		public Payment() {
			// TODO Auto-generated constructor stub
		}
	
		public String getPaymentStatus() {
			return paymentStatus;
		}
		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}
		public String getTrxnId() {
			return trxnId;
		}
		public void setTrxnId(String trxnId) {
			this.trxnId = trxnId;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
	}


