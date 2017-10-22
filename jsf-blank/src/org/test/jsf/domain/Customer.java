package org.test.jsf.domain;

public class Customer {

	private String id;
	private String firstName;
	private String lastName;
	private double balanceNoSign;
	private double balance;

	public Customer() {
	}

	public Customer(String id, String firstName, String lastName,
			double balance) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.balanceNoSign = balance;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalanceNoSign() {
		return balanceNoSign;
	}

	public void setBalanceNoSign(double balanceNoSign) {
		this.balanceNoSign = balanceNoSign;
	}
}
