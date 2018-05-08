package numberpro;

import java.util.Scanner;

public class OneBitSetted {

	static int countSetBit(int n) {
		int count = 0;
		while (n != 0) {
			int r = n % 2;
			if (r == 1) {
				count++;
			}
			n = n / 2;

		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(countSetBit(n));
	}

}
