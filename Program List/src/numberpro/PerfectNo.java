package numberpro;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {

		System.out.println("Enter No");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		boolean c = isPerfect(n);
		if (c)
			System.out.println(+n + " is Perfect No");
		else
			System.out.println(+n + "is not Perfect No");

	}

	static boolean isPerfect(int x) {
		int sum = 0;
		int i = 1;
		while (i <= x / 2) {
			if (x % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == x)
			return true;
		else
			return false;

	}
}
