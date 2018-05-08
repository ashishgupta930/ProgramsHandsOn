package numberpro;

import java.util.Scanner;

public class DecimalToBinary {
	static String isdecToBin(int n) {
		String bin = " ";
		while(n!=0) {
			int r = n%2;
			bin = r+bin;
			n=n/2;
			
		}
		return bin;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Decial no");
		int n =sc.nextInt();
		System.out.println("Binay no is "+isdecToBin(n));
	}

}
