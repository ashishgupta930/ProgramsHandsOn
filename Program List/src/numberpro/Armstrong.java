package numberpro;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n= sc.nextInt();
		sc.close();
		boolean rs= isArmStrong(n);
		if(rs) {
			System.out.println(n+" is Armstrong No");
		}
		else
			System.out.println(n+" is not a armstrong no");
	}
	static boolean isArmStrong(int n) {
		
		
		int dc = numberOfDigit(n);
		int sum=0,t=n;
		do {
			int r=n%10;
			sum = sum+pow(r,dc);
			n=n/10;
		}while(n!=0);
		return sum==t;
	}
	static int pow(int remainder,int count) {//3,3
		int pw =1;
		while(count>0) {
			pw =pw*remainder;
			count--;
		}
		return pw; 
	}
	static int numberOfDigit(int n) {
		int count =0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
}
