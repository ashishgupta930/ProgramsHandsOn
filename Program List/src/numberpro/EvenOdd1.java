package numberpro;

import java.util.Scanner;

public class EvenOdd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int n = sc.nextInt();
		sc.close();
		String str[]= {"even","odd"};
		System.out.println(+n + " is a "+str[n%2]);
		
	}
}
