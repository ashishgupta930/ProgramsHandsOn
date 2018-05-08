package numberpro;

import java.util.Scanner;

public class StrongNumber {
	
	static boolean isStrong(int n) {
		int sum =0,t=n;
		do {
			int r =n%10;
			sum = sum + fact(r);
			n=n/10;
		}while(n!=0);
		return sum==t;
	}
	static int fact(int x) {
		int fc =1;
		while(x>1) {
			fc=fc*x;
			x--;
		}
		return fc;
	}

	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean rs = isStrong(n);
		if(rs==true) {
		System.out.println("Strong No ");
		}
		else
		{
			System.out.println("Not a Strong ");
	}
	}}
