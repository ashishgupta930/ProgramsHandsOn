package patternprogram;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
	
		for (int i = 1; i <= n; i++) {
				for(int j=1;j<=n;j++) {
					System.out.print("*");
				}
				System.out.println();
	}
	}
}
