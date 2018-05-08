package numberpro;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(n%2==0)
			System.out.println(n +" is the even no");
		else
			System.out.println(n +" is the odd no");

}

}
