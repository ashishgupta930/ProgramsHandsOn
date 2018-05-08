package array;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		
			ArrayOperation ao = new ArrayOperation();
			System.out.println("Read Array elements");
			int x[] = ao.readArr();

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the index to exchange");
			int in = sc.nextInt();

			/*
			 * System.out.println("enter the element to delete"); int ele = sc.nextInt();
			 * sc.close();
			 */

			System.out.println("Before Exchange");
			ao.dispArr(x);
			ao.exchange(x);
			System.out.println("After Exchange");
			ao.dispArr(x);
		}
	}


