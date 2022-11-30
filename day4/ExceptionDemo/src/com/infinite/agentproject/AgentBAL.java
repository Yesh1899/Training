package com.infinite.agentproject;

import java.util.List;

public class AgentBAL {
	static StringBuilder sb = new StringBuilder();
	static AgentDAO dao =  new AgentDAO();
	public List<Agent> showAgentBal() {
		return dao.showAgentDAO();
		
	}
	
	
	public String addAgentBal(Agent agent) throws AgentException {
		if(invalid(agent)==false){
			throw new AgentException(sb.toString());
			
		}
		return dao.addAgentDAO(agent);
		
	}
	public boolean invalid(Agent agent) {
		boolean valid=true;
		if(agent.getAgentId()<=0){
			valid=false;
			System.out.println("no negative or zero values");
		}
		if(agent.getFirstname().length()<5){
			valid=false;
			System.out.println("more characters required");
		}
		if(agent.getLastname().length()<5){
			valid=false;
			System.out.println("more characters required");
		}
		if(agent.getPremium()<5000||agent.getPremium()>10000){
			valid=false;
			System.out.println("more characters required");
		}
		
		return valid;
		
		
	}
	
	
	
	
	
	

}
