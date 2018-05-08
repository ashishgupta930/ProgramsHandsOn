package numberpro;

import java.util.Scanner;

public class NoOfDivisior {

	public static void main(String[] args) {

		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int c = getNumberOfDivisior(n);
		System.out.println("No Of Divisior is " + c);

	}

	static int getNumberOfDivisior(int n) {
		if (n == 1)
			return 1;
		int count = 2; // for 1 and same value(n) eg. in 24 = 1 and 24 so count=2
		System.out.println("Divisors are:1 and "+n);
		int i = 2;
		while (i<=n/2) {
			if (n%i==0) {
				count++;
				System.out.println(i);
				}
			i++;
		}
		return count;
	}
}
