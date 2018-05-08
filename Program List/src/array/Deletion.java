package array;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		System.out.println("Read Array elements");
		int x[] = ao.readArr();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index to delete");
		int in = sc.nextInt();

		/*
		 * System.out.println("enter the element to delete"); int ele = sc.nextInt();
		 * sc.close();
		 */

		System.out.println("Before delete");
		ao.dispArr(x);
		x = ao.deleteArr(x, in);
		System.out.println("After delete");
		ao.dispArr(x);
	}
}
