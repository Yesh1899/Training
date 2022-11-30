package com.infinite.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infinite.JdbcRealTime.ConnectionHelper;
import com.infinite.JdbcRealTime.Employ;
public class AgentDAO {
	Connection connection;
	PreparedStatement pst;
	
	
	public  String addAgent(Agent agent) throws SQLException, ClassNotFoundException{
		connection = ConnectionHelper.getConnection();
		 String cmd = "insert into agent(name,city,gender,MaritalStatus,premium)" + "values(?,?,?,?,?)";
		 pst = connection.prepareStatement(cmd);
		 pst.setString(1,agent.getName());
		 pst.setString(2,agent.getCity());
		 pst.setString(3, agent.getGender());
		 pst.setInt(4,agent.getMaritalStatus());
		 pst.setDouble(5,agent.getPremium());
		 pst.executeUpdate();
		 return "agent record inserted";
	}
	public Agent searchAgent(int agentId) throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select*from agent where agentId=?";
		
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, agentId);
		ResultSet rs = pst.executeQuery();
		Agent agent=null;
		 if(rs.next()){
			 agent=new Agent();
			 agent.setAgentId(rs.getInt("agentId"));
			 agent.setName(rs.getString("name"));
			 agent.setMaritalStatus(rs.getInt("maritalstatus"));
			 agent.setCity(rs.getString("city"));
			 agent.setGender(rs.getString("gender"));
			 agent.setPremium(rs.getInt("premium"));
		    }
		return agent;	
	}
	
	public List<Agent> showAgent() throws SQLException, ClassNotFoundException {
		List<Agent> agentList = new ArrayList<Agent>();
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Agent";
	    pst = connection.prepareStatement(cmd);
	    ResultSet rs = pst.executeQuery();
	    Agent agent =null;
	    while(rs.next()){
	    	agent = new Agent();
	    	agent.setAgentId(rs.getInt("agentId"));
	    	agent.setName(rs.getString("name"));
	    	agent.setCity(rs.getString("city"));
	    	agent.setMaritalStatus(rs.getInt("maritalstatus"));
	    	agent.setGender(rs.getString("gender"));
	    	agent.setPremium(rs.getInt("premium"));
	    	agentList.add(agent);
	    

	    }
		return agentList;

	}
	


}
