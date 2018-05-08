package numberpro;

import java.util.Scanner;

public class SumOfNatualNumber {

	static int isNaturalNumber(int n) {

		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i;
			System.out.println("Count is:" + i);
			i++;
			}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Sum is :" + isNaturalNumber(n));

	}
}
