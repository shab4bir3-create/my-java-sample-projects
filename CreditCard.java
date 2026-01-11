package com.abcbank.credicard;
 
public class CreditCard {
 
	private int creditCardNumber;
	private String expiryDate;
	private int cvv;
	private String customerName;
	public CreditCard(int creditCardNumber, String expiryDate, int cvv, String customerName) {
 
		this.creditCardNumber = creditCardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.customerName = customerName;
	}
 
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
 
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
 
	public String getExpiryDate() {
		return expiryDate;
	}
 
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
 
	public int getCvv() {
		return cvv;
	}
 
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
 
	public String getCustomerName() {
		return customerName;
	}
 
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


}