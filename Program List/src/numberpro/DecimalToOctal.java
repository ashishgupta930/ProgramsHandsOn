package numberpro;

import java.util.Scanner;

public class DecimalToOctal {

	static String isdecToBin(int n) {
			String oct = " ";
			while(n!=0) {
				int r = n%8;
				oct = r+oct;
				n=n/8;
				
			}
			return oct;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter Decial no");
			int n =sc.nextInt();
			System.out.println("Octal no is "+isdecToBin(n));
		}

	}


