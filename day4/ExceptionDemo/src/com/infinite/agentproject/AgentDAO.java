package com.infinite.agentproject;

import java.util.ArrayList;
import java.util.List;
public class AgentDAO {
	static List<Agent> agentList;
	static{
		agentList=new ArrayList<Agent>();
	}
	public List<Agent> showAgentDAO() {
		return agentList;
		
	}
	public String addAgentDAO(Agent agent){
		agentList.add(agent);
		return "Agent record inserted";
	}

}
