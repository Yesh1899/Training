package com.infinite.BankProject;

public class Bank {
	private int accountNo;
	private String firstname;
	private String lastname;
	private String city;
	private String state;
	private int amount;
	private String cheqFacil;
	private String accountType;
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city
				+ ", state=" + state + ", amount=" + amount + ", cheqFacil=" + cheqFacil + ", accountType="
				+ accountType + "]";
	}
	public Bank(int accountNo, String firstname, String lastname, String city, String state, int amount,
			String cheqFacil, String accountType) {
		this.accountNo = accountNo;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.state = state;
		this.amount = amount;
		this.cheqFacil = cheqFacil;
		this.accountType = accountType;
	}
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheqFacil() {
		return cheqFacil;
	}
	public void setCheqFacil(String cheqFacil) {
		this.cheqFacil = cheqFacil;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	

}
