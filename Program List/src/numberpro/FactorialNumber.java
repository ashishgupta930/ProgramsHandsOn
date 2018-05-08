package numberpro;

import java.util.Scanner;

public class FactorialNumber {

	static int isFactorial(int n) {
		
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
			System.out.println(+i+"! ="+fact);
		}
		return fact;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Factorial is :"+isFactorial(n));
	}
}
