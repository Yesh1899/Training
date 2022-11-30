package com.infinite.exam;

public class Agent {
	private int AgentId;
	private String name;
	private String city;
	private String gender;
	private int maritalStatus;
	private double premium;
	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", maritalStatus=" + maritalStatus + ", premium=" + premium + "]";
	}
	public Agent(int agentId, String name, String city, String gender, int maritalStatus, double premium) {
	
		AgentId = agentId;
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.premium = premium;
	}
	public Agent() {
		
		// TODO Auto-generated constructor stub
	}
	public int getAgentId() {
		return AgentId;
	}
	public void setAgentId(int agentId) {
		AgentId = agentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String string) {
		this.gender = string;
	}
	public int getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	
	

}
