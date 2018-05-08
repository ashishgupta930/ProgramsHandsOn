package numberpro;

import java.util.Scanner;

public class EvenOdd2 {

	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		if(no/2*2==no)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
