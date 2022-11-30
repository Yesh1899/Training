package com.infinite.exam;

import java.sql.SQLException;
import java.util.Scanner;
public class AgentSearchMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int agentId;
		System.out.println("enter employ number:");
		agentId=sc.nextInt();
		AgentDAO dao = new AgentDAO();
		try {
			Agent agent = dao.searchAgent(agentId);
			if(agent!=null){
				System.out.println(agent);
			}
			else{
				System.out.println("record not found");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
