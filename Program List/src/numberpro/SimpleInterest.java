package numberpro;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		System.out.println("Enter Principal,rate,time");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		double r = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		double result = (p * r * t) / 100;
		System.out.println(result);
	}

}
