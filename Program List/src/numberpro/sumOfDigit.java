package numberpro;

import java.util.Scanner;

public class sumOfDigit {

	static int sumDigit(int n) {
		int sum =0;
		do {
			int r=n%10;   //remainder
			sum = sum+r;
			n=n/10;    //quotient
			
		}while(n!=0);
		
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(sumDigit(n));
	}
}
