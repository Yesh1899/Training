package com.infinite.agentproject;

public class Agent {
	private int agentId;
	private String firstname;
	private String lastname;
	private double premium;
	private PayMode payMode;
	public PayMode getPayMode() {
		return payMode;
	}
	public void setPayMode(PayMode payMode) {
		this.payMode = payMode;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", firstname=" + firstname + ", lastname=" + lastname + ", premium="
				+ premium + "]";
	}
	public Agent(int agentId, String firstname, String lastname, double premium) {
		
		this.agentId = agentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.premium = premium;
	}
	public Agent() {
		
		// TODO Auto-generated constructor stub
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
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
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
}
