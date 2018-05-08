package patternprogram;

import java.util.Scanner;

public class StarPattern1 {
	void patternStarNo(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		StarPattern1 ps = new StarPattern1();
		ps.patternStarNo(n);

	}
}
