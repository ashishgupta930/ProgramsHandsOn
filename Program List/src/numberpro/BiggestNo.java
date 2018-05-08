package numberpro;

import java.util.Scanner;

public class BiggestNo {

	public static void main(String[] args) {
		
		System.out.println("Enter Two Number to Check");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		if(num1>num2) {
			System.out.println("Num 1 is bigger");
			
		}
		else {
			System.out.println("Num 2 is bigger");
		}
		
	}
}
