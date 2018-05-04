package numberpro;

import java.util.Scanner;

public class productOfDigit {
	
	static int productDigit(int n) {
		int product =1;
		do {
			int r= n%10;
		    product = product*r;
			n = n/10;
					
		}while(n!=0);
		return product;
	}

	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(productDigit(n));
	}
}
