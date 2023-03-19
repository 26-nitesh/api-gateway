package com.safari.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product_TB")
public class Payment {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String paymentStatus;
	private String trxnId;
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
