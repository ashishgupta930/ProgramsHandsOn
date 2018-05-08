package numberpro;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		System.out.println("Enter the Radius");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		double rad = 3.14*r*r;
		System.out.println("Area of Circle is "+rad);
		
		

	}

}
