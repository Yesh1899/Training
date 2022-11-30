package com.infinte.sup;

public class Rom {
	public static void main(String[] args) {
		
		String n="215";
		char j=n.charAt(1);
		char y=n.charAt(2);
		int b=Integer.parseInt(String.valueOf(j));


		int a=Integer.parseInt(String.valueOf(y));
//		System.out.println(y);
		int len=n.length();
//		System.out.println(len);
		if(len==2){
			System.out.println("X");
		}
		switch(a){
		case 1:
			System.out.print("I");
			break;
		
	    case 2:
		    System.out.print("II");
		    break;
	    
		case 3:
			System.out.print("III");
			break;
		
		case 4:
			System.out.print("IV");
			break;
		case 5:
			System.out.print("V");
			break;
		case 6:
			System.out.println("VI");
			break;
		case 7:
			System.out.println("VII");
			break;
		case 8:
			System.out.println("VIII");
			break;
		case 9:
			System.out.println("IX");
			break;
		case 10:
			System.out.println("X");
			break;
		case 0:
			System.out.println("X");
			break;
		
	}
		if(len==3){
			System.out.println("X");
		}
		switch(b){
		case 1:
			System.out.print("I");
			break;
		
	    case 2:
		    System.out.print("II");
		    break;
	    
		case 3:
			System.out.print("III");
			break;
		
		case 4:
			System.out.print("IV");
			break;
		case 5:
			System.out.print("V");
			break;
		case 6:
			System.out.println("VI");
			break;
		case 7:
			System.out.println("VII");
			break;
		case 8:
			System.out.println("VIII");
			break;
		case 9:
			System.out.println("IX");
			break;
		case 10:
			System.out.println("X");
			break;
		case 0:
			System.out.println("X");
			break;
	
}
}

}
