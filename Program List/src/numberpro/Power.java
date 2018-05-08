package numberpro;

import java.util.Scanner;

public class Power {
	
	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0)
			pw = pw * n;
		p--;
		System.out.println(pw);
		return pw;
	}

	public static void main(String[] args) {
		System.out.println("Enter No");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int p =sc.nextInt();
	
		int powerresult= pow(n,p);
		System.out.println(powerresult);
	}
}
