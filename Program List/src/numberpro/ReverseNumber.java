package numberpro;

import java.util.Scanner;

public class ReverseNumber {

	static int reverseNumber(int n) {
		int rev=0;
		do {
			int r =n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Reverse No is "+reverseNumber(n));
	}
}
