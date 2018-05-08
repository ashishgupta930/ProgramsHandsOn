package numberpro;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		System.out.println("Enter no to check");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num<0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is positive");

	}

}
