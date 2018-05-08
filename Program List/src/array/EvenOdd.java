package array;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many value you have");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter " + n + " Integer Value");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();

		}
		int c[] = countEO(ar);
		System.out.println("Number of even number " + c[0]);
		System.out.println("Number of odd number " + c[1]);

	}

	static int[] countEO(int[] ar) {
		int count[] = new int[2];
		for (int i = 0; i < ar.length; i++) {
			/*
			 * if(ar[i]%2==0) { count[0]++;
			 * 
			 * } else count[1]++; }
			 */
			count[ar[i] % 2]++;
		}
		return count;

	}
}
