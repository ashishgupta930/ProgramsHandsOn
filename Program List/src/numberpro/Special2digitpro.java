package numberpro;

import java.util.Scanner;

public class Special2digitpro {

	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if((no/10+no%10)+(no/10)*(no%10)==no)
			System.out.println(+no +" is Special");
		else
			System.out.println(+no + " is not Special");
			
	}
}
