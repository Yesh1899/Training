package com.infinite.intf;
interface ITraining{
	void name();
	void email();
}
class Yeshwanth implements ITraining{

	@Override
	public void name() {
		System.out.println("name is yeshwanth");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email() {
		System.out.println("mail is yeshwanth@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
class Yesh implements ITraining{

	@Override
	public void name() {
		System.out.println("name is yesh");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email() {
		System.out.println("mail is yesh@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
public class IntfDemo { 
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
				new Yesh(),
				new Yeshwanth()
			
		
		};
		for (ITraining i : arr) {
			i.email();
			i.name();
			
		}
	}

}
