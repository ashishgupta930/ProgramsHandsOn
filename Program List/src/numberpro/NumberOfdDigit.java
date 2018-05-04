package numberpro;

import java.util.Scanner;

public class NumberOfdDigit {

	static int getNumberOfDigit(int n) {
		int count =0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("No Of Digit "+getNumberOfDigit(n));
	}
}
