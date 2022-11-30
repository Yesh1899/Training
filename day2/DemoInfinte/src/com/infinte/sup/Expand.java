package com.infinte.sup;

public class Expand {

	public static void main(String[] args) {
		String num="6426";
		char y=num.charAt(0);
		char e=num.charAt(1);
		char iop=num.charAt(2);
		char las=num.charAt(3);
		int o=Integer.parseInt(String.valueOf(y));
		int loi=Integer.parseInt(String.valueOf(iop));
		int d=Integer.parseInt(String.valueOf(e));
		int last=Integer.parseInt(String.valueOf(las));
		String[] k = new String[]{
				"one","two","three","four","five","six","seven","eight","nine"
		};
		int i=0;
		if(i < o) {
			int iu=o;
			String z=k[iu-1];
			System.out.println(z+" thousand");
		}
		String[] l = new String[]{
				"one","two","three","four","five","six","seven","eight","nine"
		};
		String[] sta = new String[]{
				"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"
		};
		if(i < d) {
			int sdn=d;
			String kil=l[sdn-1];
			System.out.println(kil+" hundred ");
		}
		if(i < loi) {
			int hyd=loi;
			String lov=sta[hyd-1];
			System.out.println(lov);
		}
		if(i < last) {
			int hyder=last;
			String love=l[hyder-1];
			System.out.println(love);
		}
//System.out.println(char(z)+" thousand"+kil+" humdred "+lov+love);

	}

}
