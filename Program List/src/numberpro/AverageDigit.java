package numberpro;

import java.util.Scanner;

public class AverageDigit {

	static int averageDigit(int n) {

		int average = 0;
		int count = 0;
		do {
			count++;
			int r = n % 10;
			average = average + r;
			n = n / 10;
			
		} while (n != 0);
		return average / count;
	}

	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(averageDigit(n));
	}
}
