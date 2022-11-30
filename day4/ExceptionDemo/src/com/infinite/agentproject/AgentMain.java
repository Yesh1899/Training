package com.infinite.agentproject;
import java.util.List;
import java.util.Scanner;
public class AgentMain {
	static Scanner sc = new Scanner(System.in);
	static AgentBAL bal = new AgentBAL();
	public static void main(String[] args) {
		int choice;
		do{
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1, Add Agent");
			System.out.println("2, Show Agentlist");
			System.out.println("6, Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				try {
					addAgentMain();
				} catch (AgentException e) {
					System.err.println(e.getMessage());
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				break;
			case 2:
				showAgentMain();
				break;
			case 6:
				
				break;
			}
		}
		while(choice!=6);
	}
	public static void showAgentMain() {
		List<Agent> agentList= bal.showAgentBal();
		for (Agent agent : agentList) {
			System.out.println(agent);
		}	
	}
	public static void addAgentMain() throws AgentException {
		Agent agent =new Agent();
		System.out.println("enter the agentId");
		agent.setAgentId(sc.nextInt());
		System.out.println("enter firstname");
		agent.setFirstname(sc.next());
		System.out.println("enter lastname");
		agent.setLastname(sc.next());
		System.out.println("enter paymode");
		String pmode = sc.next();
		if(pmode.toUpperCase().equals("YEARLY")){
			agent.setPayMode(PayMode.YEARLY);
		}
		if(pmode.toUpperCase().equals("HALFYEARLY")){
			agent.setPayMode(PayMode.HALFYEARLY);
		}
		if(pmode.toUpperCase().equals("QUATERLY")){
			agent.setPayMode(PayMode.QUATERLY);
		}
		System.out.println("enter premium");
		agent.setPremium(sc.nextDouble());
		System.out.println(bal.addAgentBal(agent));	
	}
}
