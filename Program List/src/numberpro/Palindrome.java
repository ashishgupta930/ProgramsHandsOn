package numberpro;

import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(int n) {
		int rev=0,t=n;
		do {
			int r =n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
		return rev==t;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int n = sc.nextInt();
		boolean pl =isPalindrome(n);
		if(pl)
		System.out.println(n +" is Palindrome No ");
		else
			System.out.println(n +" is not palindrome No");
	}
}
