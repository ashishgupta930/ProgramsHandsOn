package numberpro;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		sc.close();
		boolean rs = isPrime(n);
		if(rs)
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is not prime no");
	}

	static boolean isPrime(int no) {
		
		int i=2;
		while(i<=no/2) {
		if(no%i==0) {
			return false;
		}
		i++;
		
	}if(no==1||no==0)
		return false;
	else
		return true;
	}
}