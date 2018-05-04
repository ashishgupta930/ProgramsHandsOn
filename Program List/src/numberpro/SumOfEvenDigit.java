package numberpro;

import java.util.Scanner;

public class SumOfEvenDigit {
	
	static int sumEvenDigit(int n) {
		int sum =0;
		do {
			int r = n%10;
			if(r%2==0) {
				sum= sum+r;
			}
			n=n/10;
			
		}while(n!=0);
		
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		System.out.println(sumEvenDigit(n));
	}
}
