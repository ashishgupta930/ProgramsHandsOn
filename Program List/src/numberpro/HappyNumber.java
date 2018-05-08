package numberpro;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		sc.close();
		boolean rs = isHappyNumber(n);
		if (rs) {
			System.out.println(n + " is Happy No");
		} else
			System.out.println(n + " is not a Happy no");
	}

	static boolean isHappyNumber(int n) {
		while (n >= 9) {
			int sum = 0;
			while (n != 0) {
				int r = n % 10;
				sum = sum + r * r;
				n = n / 10;

			}
			n = sum;
		}
		return n == 1 || n == 7;
	}

}
