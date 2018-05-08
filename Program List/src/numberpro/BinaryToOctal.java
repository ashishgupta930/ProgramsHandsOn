package numberpro;

import java.util.Scanner;

public class BinaryToOctal {

	static int binToOctal(int bin) {
			int oct =0,c=0;
			do {
				int r=bin%10;
				oct = oct+r*pow(8,c);
				c++;
				bin=bin/10;
			}while(bin!=0);
			return oct;
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
			int bin = sc.nextInt();
			System.out.println("Octal No is "+binToOctal(bin));
		}
	}


