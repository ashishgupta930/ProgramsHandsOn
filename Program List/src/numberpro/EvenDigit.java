package numberpro;

import java.util.Scanner;

public class EvenDigit {
	
	static int evenDigit(int n) {
		int count =0;
		do {
			
			int r = n%10;
			if(r%2==0) {
				count++;	
			}
			n=n/10;
			
		}while(n!=0);
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int a = evenDigit(n);
		System.out.println(a);
	}
}
