package com.it.berdeja.oop.store;

public class DefaultOrder implements Order {
	private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;
	
	private String creditCardNumber;
	private Product[] products;
	private int customerId;

	@Override
	public boolean isCreditCardNumberValid(String userInput) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCreditCardNumber(String userInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setProducts(Product[] products) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCustomerId(int customerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCustomerId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// <write your code here>
		return null;
	}
}
