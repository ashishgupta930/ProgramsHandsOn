package array;

import java.util.Scanner;

public class Insertion {
public static void main(String[] args) {
		
		ArrayOperation ao = new ArrayOperation();
		System.out.println("Read Array elements");
		int x[] = ao.readArr();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index to insert");
		int in = sc.nextInt();
		
		System.out.println("enter the element to insert");
		int ele = sc.nextInt();
		sc.close();
		
		System.out.println("before insert");
		ao.dispArr(x);
		x = ao.insertArr(x, in, ele);
		System.out.println("after insert");
		ao.dispArr(x);
	}
}
