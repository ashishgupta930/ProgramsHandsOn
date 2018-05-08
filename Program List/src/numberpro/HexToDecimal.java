package numberpro;

import java.util.Scanner;

public class HexToDecimal {

	static int hexToDec(String st) {
		int dec=0,c=0;
		for(int i=st.length()-1;i>=0;i--) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='F') {
				dec=dec+(ch-55)*pow(16,c);
			}
			else if(ch>='a'&&ch<='f') {
				dec=dec+(ch-87)*pow(16,c);
			}
			else
				dec=dec+(ch-48)*pow(16,c);
			c++;
		}
		
		return dec;
	}
	static int pow(int n,int p) {
		int pw=1;
		
		while(p>0) {
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		String st = sc.nextLine();
		System.out.println(hexToDec(st));
	}
}
